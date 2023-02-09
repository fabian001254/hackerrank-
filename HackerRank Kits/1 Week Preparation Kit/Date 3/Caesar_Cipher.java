/*
 *  Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
    Original alphabet:      abcdefghijklmnopqrstuvwxyz
    Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
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
    public static String caesarCipher(String s, int k) {
        String finalc = "";
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 'a' && list.get(i) <= 'z') {
                finalc+= (char)(97+((list.get(i)+k-97) % 26));               
            }else if(list.get(i) >= 'A' && list.get(i) <= 'Z') {
                finalc+= (char)(65+((list.get(i)+k-65) % 26));
            }else{
                finalc+= list.get(i);
            }
        }
        return finalc;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
