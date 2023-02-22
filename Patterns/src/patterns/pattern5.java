/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        /** COMBINATION OF PATTERN 4 & PATTERN 3 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /** TOP */
        int i = n;
        for (; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /** BOTTOM */
        i = 1;
        for(; i <= (n-1); i++) {
            for (int j = i; j <= (n-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
