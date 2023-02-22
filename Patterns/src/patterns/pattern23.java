/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {

        /**
            THIS PATTERN ONLY WORK FOR INPUT 3
         * **/

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lSpace = n+1; // highest l space
        int vSpace = n*2; // highest v space
        int nSpace = 0; // smallest n space
        for (int i = n; i > 0; i--) {
            String lGap = " ".repeat(lSpace);
            String vGap = " ".repeat(vSpace);
            String nGap = " ".repeat(nSpace);
            for (int j = i; j <= n; j++) {
                if(j >= i && j == n) {
                    System.out.print(lGap);
                    System.out.print("*");
                    /** N LAYER */
                    System.out.print(nGap);
                    if(nSpace > 0) {
                        System.out.print("*");
                    }
                    /** V LAYER */
                    System.out.print(vGap);
                    if(vSpace > 0) {
                        System.out.print("*");
                    }
                    /** LAST LAYER */
                    System.out.print(nGap);
                    if(nSpace > 0) {
                        System.out.print("*");
                    }
                }
            }
            vSpace = vSpace - lSpace;
            lSpace = (lSpace/2) == 1 ? 0 : (lSpace/2);
            nSpace += n;
            System.out.println();
        }
    }
}
