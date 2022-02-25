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
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
    
    //Step-1:- calculate the distances of apples fallen relative to the apple tree
    //Step-2:- calculate the distances of oranges fallen relative to the orange tree
    //Step-3:- calculate the apple and oranges falling on the house by loop (s to t)
    //Step-4:- Print the results
    
    int apple_result = 0;
    int orange_result = 0;
    List<Integer> apple_temp = new ArrayList<Integer>();
    for(int i = 0; i<apples.size(); i++)
    {
        int temp = apples.get(i);
        apple_temp.add(temp + a);
    }
    
    List<Integer> orange_temp = new ArrayList<Integer>();
    for(int i = 0; i<oranges.size(); i++)
    {
        int temp = oranges.get(i);
        orange_temp.add(temp + b);
    }
    
    for(int i = s; i<=t;i++)
    {
        if(apple_temp.contains(i))
        {
            apple_result = apple_result+1;
        }
        
        if(orange_temp.contains(i))
        {
            orange_result = orange_result+1;
        }
    }
    
    System.out.println(apple_result);
    System.out.println(orange_result);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
