/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        /** COMBINATION OF PATTERN 11 & PATTERN 10 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /** TOP */
        int i = 1;
        for (; i <= n; i++) {
            System.out.print(" ".repeat(i-1));
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            if(i!=1) System.out.print(" ".repeat(i-2));
            System.out.println();
        }
        /** BOTTOM */
        i = n;
        for (; i > 0; i--) {
            String space = " ".repeat(i-1);
            System.out.print(space);
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            if(i!=1) System.out.print(" ".repeat(i-2));
            System.out.println();
        }
    }
}
