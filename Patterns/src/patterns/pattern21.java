/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = 1;
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                int count = (int) Math.log10((double) prev) + 1;
                System.out.print(prev);
                if(count <= 1) System.out.print("  ");
                else System.out.print(" ");
                prev++;
            }
            System.out.println();
        }
    }
}
