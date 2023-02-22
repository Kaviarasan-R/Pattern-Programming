/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = n-2;
            String lSpace = " ".repeat(n-i);
            String cSpace = " ".repeat(k);
            System.out.print(lSpace);
            for (int j = 1; j <= n; j++) {
                if(j==1 || i==1 || i==n) System.out.print("*");
            }
            if(i!=1 && i!=n) System.out.print(cSpace+"*");
            System.out.println();
        }
    }
}
