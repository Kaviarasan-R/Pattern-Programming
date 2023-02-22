/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j;
        /** TOP */
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            int k = (n-i+1);
            String star = " ".repeat(i-1);
            /** LEFT --> PATTERN 3 */
            for (j = i; j <= n; j++) {
                System.out.print("*");
            }
            /** FILLING EXTRA SPACES */
            while(k < n) {
                System.out.print(" ");
                k++;
            }
            /** RIGHT --> PATTERN 2 */
            for (j = i; j <= n; j++) {
                if(flag) {
                    System.out.print(star);
                    flag = false;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        /** BOTTOM */
        for (int i = n; i > 0; i--) {
            boolean flag = true;
            int k = (n-i+1);
            String star = " ".repeat(i-1);
            /** LEFT --> PATTERN 7 */
            for (j = i; j <= n; j++) {
                System.out.print("*");
            }
            /** FILLING EXTRA SPACES */
            while(k < n) {
                System.out.print(" ");
                k++;
            }
            /** RIGHT --> PATTERN 6 */
            for (j = i; j <= n; j++) {
                if(flag) {
                    System.out.print(star);
                    flag = false;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
