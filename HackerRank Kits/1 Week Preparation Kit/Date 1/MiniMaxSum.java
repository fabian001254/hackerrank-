/*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    Example
    arr = [1,3,5,7,9]
    The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints
    16 24

    Complete the miniMaxSum function in the editor below.
    miniMaxSum has the following parameter(s):
    arr: an array of 5 integers
    Print
    Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
    Input Format
    A single line of five space-separated integers.
    Constraints
    1<=arr[i]<=10^9
    Output Format
    Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
    Sample Input

    1 2 3 4 5
    Sample Output

    10 14
    Explanation
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            long n = in.nextLong();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}