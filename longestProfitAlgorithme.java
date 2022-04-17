import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static int longestProfit(int[] data) {
        int n = data.length;
        int longestProfit[] = new int[n];
        int i, j, max = 0;
        for (i = 0; i < n; i++) {
            longestProfit[i] = 1;
        }
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (data[i] > data[j] && longestProfit[i] < longestProfit[j] + 1) {
                    longestProfit[i] = longestProfit[j] + 1;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (max < longestProfit[i]) {
                max = longestProfit[i];
            }
        }
        return max;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int longestSequence = longestProfit(data);
        System.setOut(outStream);
        System.out.println(longestSequence);
    }
    // #endregion
}
