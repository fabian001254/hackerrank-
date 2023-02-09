import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class grid{

    static String gridChallenge(String[] grid) {
        for (int i = 0; i < grid.length; i++) {
            char[] row = grid[i].toCharArray();
            Arrays.sort(row);
            grid[i] = new String(row);
        }

        for (int j = 0; j < grid[0].length(); j++) {
            for (int i = 1; i < grid.length; i++) {
                if (grid[i].charAt(j) < grid[i-1].charAt(j)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);

            System.out.println(result);
        }

        scanner.close();
    }
}
