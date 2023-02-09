import java.util.*;

public class New_Year_Chaos{
    static void minimumBribes(int[] q) {
        int n = q.length;
        int bribes = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = scan.nextInt();
            }
            minimumBribes(q);
        }
        scan.close();
    }
}
