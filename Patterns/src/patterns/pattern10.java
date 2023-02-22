/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
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
