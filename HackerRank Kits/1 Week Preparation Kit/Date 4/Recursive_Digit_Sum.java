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
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        BigInteger sum = BigInteger.valueOf(0);
        if(n.length() == 1) return Integer.parseInt(n);
        sum = new BigInteger(n).multiply(BigInteger.valueOf(k));        
        return isOneValue(sum);
    }
    
    public static int isOneValue(BigInteger sum){
        String num = sum.toString();
        BigInteger newSum = BigInteger.valueOf(0);
        while(num.length() != 1){
                for(int i = 0; i<num.length(); i++){
                    newSum = newSum.add(BigInteger.valueOf(Character.getNumericValue(num.charAt(i))));
                }
                num = newSum.toString();
                newSum = BigInteger.valueOf(0);
        }
        return Integer.parseInt(num); 
    }

}

public class Recursive_Digit_Sum{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

