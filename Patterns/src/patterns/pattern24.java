/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /** TOP */
        for (int i = n; i > 0; i--) {
            int count = 0;
            int nGap = Math.max(n - i - 1, 0);
            String vSpace = " ".repeat((i-1)*2);
            String nSpace = " ".repeat(nGap);
            int j = i+nGap;
            for (; j <= n && count <= 1; j++) {
                System.out.print("*");
                if(j==n) {
                    System.out.print(vSpace);
                    j = i+nGap-1;
                    count++;
                } else System.out.print(nSpace);
            }
            System.out.println();
        }
        /** BOTTOM */
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int nGap = Math.max(n - i - 1, 0);
            int vGap = (i-1)*2;
            String vSpace = " ".repeat(vGap);
            String nSpace = " ".repeat(nGap);
            int j = Math.abs(Math.abs(i-n-1) - nGap);
            while(j > 0 && count <= 1) {
                System.out.print("*");
                if(j==1) {
                    System.out.print(vSpace);
                    j = Math.abs(Math.abs(i-n-1) - nGap);
                    count++;
                    continue;
                } else System.out.print(nSpace);
                j--;
            }
            System.out.println();
        }
    }
}
