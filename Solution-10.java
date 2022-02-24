import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
    
    //Step-1:- Convert the strings into bigIntegers
    //Step-2:- Add the bigIntegers to an ArrayList of BigIntegers.
    //Step-3:- Sort the ArrayList
    //Step-4:- Convert into Strings
    //Step-5:- Return the new String List
    
    ArrayList<BigInteger> bigList = new ArrayList<BigInteger>() ;
        for(int i = 0; i<unsorted.size(); i++)
        {
            BigInteger b1 = new BigInteger(unsorted.get(i));
            bigList.add(b1);
        }
        
        Collections.sort(bigList);
        
        List<String> sNumbers = new ArrayList<String>();
        for (BigInteger i: bigList) 
        {
             sNumbers.add(String.valueOf(i));
        }
        
        return sNumbers;       
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.bigSorting(unsorted);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
