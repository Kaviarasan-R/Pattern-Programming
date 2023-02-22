/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                char c = (char) ('A'+(j-1));
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
