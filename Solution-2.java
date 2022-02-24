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
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    // Write your code here
    int alice_points=0;
    int bob_points=0;
    
    //First element is being compared here
     if(a.get(0) > b.get(0))
     {
         alice_points = alice_points+1;
     }
     else if(a.get(0) < b.get(0))
     {
         bob_points = bob_points +1;
     }
     else
     {
         //both will not get the points
     }
     
     //Comparing for the second position
     if(a.get(1) > b.get(1))
     {
         alice_points = alice_points+1;
     }
     else if(a.get(1) < b.get(1))
     {
         bob_points = bob_points +1;
     }
     else
     {
         //both will not get the points
     }
     
     //comparing the third elements
     if(a.get(2) > b.get(2))
     {
         alice_points = alice_points+1;
     }
     else if(a.get(2) < b.get(2))
     {
         bob_points = bob_points +1;
     }
     else
     {
         //both will not get the points
     }
     
        ArrayList<Integer> ar = new ArrayList<Integer>(2);
        ar.add(0, alice_points);
        ar.add(1, bob_points);
     return ar;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
