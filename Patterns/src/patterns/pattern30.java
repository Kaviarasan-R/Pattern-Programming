/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n*2-1; i++) {
            for (int j = 1; j <= n*2-1; j++) {
                if(i > n) { // AFTER N
                    int k = i-n;
                    int x = i+k;
                    int row = Math.abs((x-k)-(n*2));
                    if(j>=row && j<=n) System.out.print(i-n+1 + " "); // CURRENT
                    else if(j<=n) System.out.print(n-j+1 + " "); // PREVIOUS
                    else { // RIGHT HALF
                        int z = n-(j-n);
                        if(row<=z) System.out.print(i-n+1 + " "); //CURRENT
                        else System.out.print(n-z+1 + " "); // PREVIOUS
                    }
                } else { // BEFORE ≤ N
                    if(j>=i && j<=n) System.out.print(n-i+1 + " "); // CURRENT
                    else if(j<=n) System.out.print(n-j+1 + " "); // PREVIOUS
                    else { // RIGHT HALF
                        int z = n-(j-n);
                        if(z>=i) System.out.print(n-i+1 +" "); // CURRENT
                        else System.out.print(n-z+1 +" "); // PREVIOUS
                    }
                }
            }
            System.out.println();
        }
    }
}
