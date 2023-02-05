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
    Given an array of integers, where all elements but one occur twice, find the unique element.

    Example
    a = [1,2,3,4,3,2,1]
    The unique element is 4.

    Function Description

    Complete the lonelyinteger function in the editor below.

    lonelyinteger has the following parameter(s):

    int a[n]: an array of integers
    Returns

    int: the element that occurs only once
    Input Format

    The first line contains a single integer, n, the number of integers in the array.
    The second line contains n space-separated integers that describe the values in a.

    Constraints
    1 <= n < 100
    It is guaranteed that n is an odd number and that there is one unique element.
    0 <= a[i] <= 100, where 0 <= i < n. */
    public static int lonelyinteger(List<Integer> a) {
        Collections.sort(a);
        for(int i = 0 ; i< a.size(); i++){
            int count = 0;
            for(int j = 0 ; j < a.size(); j++){
                if(a.get(i) == a.get(j)){
                    count++;
                }
            }
            if(count == 1){
                return a.get(i);
            }
        }
        return -1;
        
    }

}

public class Lonely_Integer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
