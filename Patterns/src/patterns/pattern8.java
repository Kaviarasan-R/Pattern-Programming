/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        for (int i = n; i > 0; i--) {
            String space = " ".repeat(i-1);
            System.out.print(space);
            System.out.print("*".repeat(k));
            System.out.print(space);
            k+=2;
            System.out.println();
        }
    }
}
