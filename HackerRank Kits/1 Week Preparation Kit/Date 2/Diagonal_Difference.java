/*
 * For example, the square matrix is shown below:

    1 2 3
    4 5 6
    9 8 9
    The left-to-right diagonal =1 + 5 + 9 = 15. The right to left diagonal = 3 + 5+ 9 = 17. Their absolute difference is |15–17| = 2 .

    Function description
    Complete the diagonalDifference function in the editor below. It must return an integer representing the absolute diagonal difference.

    diagonalDifference takes the following parameter:

    arr: an array of integers .
    Input Format
    The first line contains a single integer, n , the number of rows and columns in the matrix arr.

    Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].

    Constraints
    . — 100 ≤ arr[i][j] ≤ 100

    Output Format
    Print the absolute difference between the sums of the matrix’s two diagonals as a single integer.

    Sample Input


    11 2 4
    4 5 6
    10 8 -12
    Sample Output

    15
    Explanation
    The primary diagonal is:

    11
    5
        -12
    Sum across the primary diagonal: 11 + 5–12 = 4

    The secondary diagonal is:

    4
    5
    10
    Sum across the secondary diagonal: 4 + 5 + 10 = 19
    Difference: |4 –19| = 15

    Note: |x| is the absolute value of x
 */
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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalP[] = new int[arr.size()];
        int diagonalS[] = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                if(i == j){
                    diagonalP[i] = arr.get(i).get(j);
                }if(i+j == arr.size()-1){
                    diagonalS[i] = arr.get(i).get(j);
                }
            }
        }
        int sump = 0;
        int sums = 0;
        for(int i = 0; i < diagonalP.length; i++) {
            sump += diagonalP[i];
        }
        for(int i = 0; i < diagonalS.length; i++) {
            sums += diagonalS[i];
        }
        
        return Math.abs(sump - sums) ;


    }

}

public class Diagonal_Difference{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

