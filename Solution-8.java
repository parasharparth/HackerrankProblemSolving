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
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    //Calculate the largest Number and then print the number of instances of that number
    //The first step is to sort the arraylist
    //The second step should be to check the last element and store it in a variable
    //The third step is to iterate the array and then find the number
    
    //Step-1:- Sort the arraylist
    Collections.sort(candles);
    
    //Step-2:- Check the last element of the arraylist and store it in a variable
    int last_element = candles.get(candles.size()-1);
    
    int result = 0;
    //Step-3:- Iterate the arraylist to find instances of the number
    for(int i = 0; i<candles.size(); i++)
    {
        if(candles.get(i) == last_element)
        {
            result = result + 1;
        }
    }
    
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
