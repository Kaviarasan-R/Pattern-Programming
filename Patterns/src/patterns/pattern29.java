/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            String space = " ".repeat((i-1)*2);
            System.out.print(space);
            for (int j = i; j <= n; j++) {
                System.out.print(n-j+1 + " ");
                if(n-j+1 == 1) {
                    int k = j-1;
                    while(k >= i) {
                        System.out.print(n-k+1 + " ");
                        k--;
                    }
                }
            }
            System.out.println();
        }
    }
}
