/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        /** COMBINATION OF PATTERN 13 & PATTERN 14 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        /** TOP */
        int i = n;
        for (; i > 0; i--) {
            System.out.print(" ".repeat(i-1));
            k = (Math.max((n - i - 1), 0)) + (n - i); // previous k + current k
            for (int j = i; j <= n && k != 0; j+=(n-i)) { // increment by current k value
                System.out.print("*");
                System.out.print(" ".repeat(k)); // repeat space by k times
            }
            if(k == 0) System.out.print("*");
            System.out.println();
        }
        /** BOTTOM */
        i = 2;
        for (; i <= n; i++) {
            System.out.print(" ".repeat(i-1));
            k = (Math.max((n - i - 1), 0)) + (n - i); // previous k + current k
            for (int j = i; j <= n && k != 0; j+=(n-i)) { // increment by current k value
                System.out.print("*");
                System.out.print(" ".repeat(k)); // repeat space by k times
            }
            if(k == 0) System.out.print("*");
            System.out.println();
        }
    }
}
