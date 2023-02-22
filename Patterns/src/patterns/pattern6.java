/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            boolean flag = true;
            String star = " ".repeat(i-1);
            for (int j = i; j <= n; j++) {
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
