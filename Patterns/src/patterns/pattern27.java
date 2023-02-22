/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {

        /** THIS PATTERN ONLY WORKS FOR INPUT 20 */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /* SIMILAR TO PATTERN 7 */

        int last = 0;
        int k = 1;
        int s = 0;
        for (int i = 1; i < n/4; i++) {
            boolean flag = true;
            int count = 0;
            String lSpace = " ".repeat(s);
            for (int j = i; j < n/4 && count <= 1; j++) {
                if(flag) {
                    System.out.print(lSpace);
                    flag = false;
                }
                if(count == 0) {
                    System.out.print(k + " ");
                    last = k;
                    k++;
                } else {
                    System.out.print(n-last+1 + " ");
                    last--;
                }
                if(j+1 == n/4) {
                    j=i-1;
                    count++;
                    if(!(i+1 == n/4)) System.out.print(" ");
                }
            }
            s += 2;
            System.out.println();
        }
    }
}
