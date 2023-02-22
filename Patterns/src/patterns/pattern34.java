/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern34 {
    public static void main(String[] args) {
        /* IT WORKS FINE FOR INPUT 4 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = n + 2;
        for (int i = n; i > 0; i--) {
            String space = " ".repeat(gap);
            for (int j = i; j <= n; j++) {
                int k = Math.abs(i-j)+1;
                System.out.print(k);
                if(j == n) {
                    int z = k;
                    System.out.print(space);
                    while(z >= 1) {
                        System.out.print(z);
                        z--;
                    }
                }
            }
            gap -= 2;
            System.out.println();
        }
    }
}
