/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c;
        int alphabet = 0;
        boolean capital = false;
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                if(!capital) c = (char) ('a'+alphabet);
                else c = (char) ('A'+alphabet);
                System.out.print(c + " ");
                capital = !capital;
                alphabet++;
            }
            System.out.println();
        }
    }
}
