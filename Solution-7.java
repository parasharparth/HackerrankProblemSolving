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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    //Sort the array in the ascending order
    //Omit First element and you have the maximum sum
    //Omit last element and you have the minimum sum
    
    //STEP-1 SORTING
    Collections.sort(arr);
    
    //STEP-2 Finding the maximum sum
    int max_sum = 0;
    for(int i = 1; i<5; i++)
    {
        max_sum = max_sum + arr.get(i);
    }
    
    //STEP-3 Finding the minimum sum
    int min_sum=0;
    for(int i = 0; i<4; i++)
    {
        min_sum = min_sum + arr.get(i);
    }
       System.out.println(min_sum + " " + max_sum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
