/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
