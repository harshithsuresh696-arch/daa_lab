
import java.util.*;

public class BreakingRecords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of games
        int n = sc.nextInt();

        int[] scores = new int[n];

        // Input scores
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Initial records (first game)
        int max = scores[0];
        int min = scores[0];

        int maxBreak = 0;
        int minBreak = 0;

        // Loop through remaining games
        for (int i = 1; i < n; i++) {

            if (scores[i] > max) {
                max = scores[i];
                maxBreak++;
            }

            if (scores[i] < min) {
                min = scores[i];
                minBreak++;
            }
        }

        // Output
        System.out.println(maxBreak + " " + minBreak);
    }
}
