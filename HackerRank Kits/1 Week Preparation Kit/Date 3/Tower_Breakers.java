/*
 * Two players are playing a game of Tower Breakers! Player 1 always moves first, and both players always play optimally. The rules of the game are as follows:

    Initially, there are N towers.
    Each tower is of height M.
    The players move in alternating turns.
    In each turn, a player can choose a tower of height X and reduce its height to Y, where 1 <= Y < X and Y evenly divide X.
    If the current player is unable to make a move, they lose the game.

    Given the values of N and M, determine which player will win. If the first player wins, return 1. Otherwise, return 2.
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
    public static int towerBreakers(int n, int m) {
        if(n % 2 == 0 || m == 1){
            return 2;
        }else{
            return 1;
        }
    }

}

public class Tower_Breakers{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.towerBreakers(n, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

