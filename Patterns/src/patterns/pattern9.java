/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /**
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         **/
        for (int i = n; i > 0; i--) {
            String space = " ".repeat(n-i);
            System.out.print(space);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("*".repeat(i-1));
            System.out.print(space);
            System.out.println();
        }
    }
}
