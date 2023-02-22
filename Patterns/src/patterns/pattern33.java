/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                char c = (char) ('A'+(n-j-1));
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
