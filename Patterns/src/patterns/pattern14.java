/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        for (int i = 1; i <= n; i++) {
            if(i==1) { // for printing first line
                System.out.print("*".repeat(n*2-1));
                System.out.println(); // new line added
                continue;
            }
            System.out.print(" ".repeat(i-1));
            k = (Math.max((n - i - 1), 0)) + (n - i); // previous k + current k
            for (int j = i; j <= n && k != 0; j+=(n-i)) { // increment by current k value
                System.out.print("*");
                System.out.print(" ".repeat(k)); // repeat space by k times
            }
            if(k == 0) System.out.print("*");
            System.out.println();
        }
    }
}
