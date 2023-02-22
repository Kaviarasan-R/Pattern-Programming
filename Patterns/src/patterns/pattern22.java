/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean xFlag = true;
        boolean yFlag = true;
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                /** print '1' if xFlag is True
                 * Or if it is First iteration + yFlag is True
                 * */
                if(xFlag || (j == i && yFlag)) System.out.print("1 ");
                else System.out.print("0 ");
                if(j == i) xFlag = !yFlag; // change only if first iteration, opposite to yFlag
                else xFlag = !xFlag; // for changing consecutive x iterations
            }
            yFlag = !yFlag; // for changing consecutive y iterations
            System.out.println();
        }
    }
}
