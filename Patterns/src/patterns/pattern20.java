/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            int k = n-2;
            String space = " ".repeat(k);
            for (int j = 1; j <= n; j++) {
                if(j==1 || i==0 || i==n) System.out.print("*");
            }
            if(i!=0 && i!=n) System.out.print(space+"*");
            System.out.println();
        }
    }
}
