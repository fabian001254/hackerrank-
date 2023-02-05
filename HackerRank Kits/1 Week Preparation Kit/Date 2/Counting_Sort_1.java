/* 
 * Comparison Sorting
    Quicksort usually has a running time of , but is there an algorithm that can sort even faster? In general, this is not possible. Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another. A comparison sort algorithm cannot beat  (worst-case) running time, since  represents the minimum number of comparisons needed to know where to place each element. For more details, you can see these notes (PDF).

    Alternative Sorting
    Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.

    Example

    All of the values are in the range , so create an array of zeros, . The results of each iteration follow:

    i	arr[i]	result
    0	1	[0, 1, 0, 0]
    1	1	[0, 2, 0, 0]
    2	3	[0, 2, 0, 1]
    3	2	[0, 2, 1, 1]
    4	1	[0, 3, 1, 1]
    The frequency array is . These values can be used to create the sorted array as well: .

    Note
    For this exercise, always return a frequency array with 100 elements. The example above shows only the first 4 elements, the remainder being zeros.

    Challenge
    Given a list of integers, count and return the number of times each value appears as an array of integers.

    Function Description

    Complete the countingSort function in the editor below.

    countingSort has the following parameter(s):

    arr[n]: an array of integers
    Returns

    int[100]: a frequency array
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Counting_Sort_1 {
	
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[100];
		for (int i = 0; i < n; i++) {
			ar[in.nextInt()]++;
		}
		
		printArray(ar);
	}

}