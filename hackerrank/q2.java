import java.util.*;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n (items) and k (index Anna didn't eat)
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] bill = new int[n];

        // Input bill items
        for (int i = 0; i < n; i++) {
            bill[i] = sc.nextInt();
        }

        // Amount Brian charged Anna
        int b = sc.nextInt();

        int total = 0;

        // Calculate total except item k
        for (int i = 0; i < n; i++) {
            if (i != k) {
                total += bill[i];
            }
        }

        int actualShare = total / 2;

        // Compare
        if (actualShare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualShare);
        }

        sc.close();
    }
}
