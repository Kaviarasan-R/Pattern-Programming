/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern2 pattern2 = new pattern2();
        pattern2.print(n);
    }
    public void print(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
