/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /** TOP */
        for (int i = n; i > 0; i--) {
            System.out.print(" ".repeat(i-1));
            /** FROM LEFT TO CENTER */
            for (int j = i; j <= n; j++) {
                System.out.print(n-j+1);
            }
            /** FROM CENTER+1 TO RIGHT */
            for (int j = n-1; j >= i; j--) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
        /** BOTTOM */
        for (int i = 2; i <= n; i++) {
            System.out.print(" ".repeat(i-1));
            /** FROM LEFT TO CENTER */
            for (int j = i; j <= n; j++) {
                System.out.print(n-j+1);
            }
            /** FROM CENTER+1 TO RIGHT */
            for (int j = n-1; j >= i; j--) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}
