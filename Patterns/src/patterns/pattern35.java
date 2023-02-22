/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * 2 - 1; // maximum value
        int k = 1; // start from 1
        int flag = 1; // flag 1 for upper & flag 0 for bottom
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if( i==j || (j==(n*2)-i) ) System.out.print(k); // print only in starting & ending
                else System.out.print(" "); // print space apart from start & end
            }
            if(flag == 1 && k < n) k++; // for top
            else { // for bottom
                flag = 0;
                k--;
            }
            System.out.println();
        }
    }
}
