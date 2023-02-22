/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(i-1));
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            if(i!=1) System.out.print(" ".repeat(i-2));
            System.out.println();
        }
    }
}
