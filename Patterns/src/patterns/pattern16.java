/**
 * Created By Kavi Arasan
 */
package patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int half;
        int prev;
        boolean even;
        for (int i = n; i > 0; i--) {
            System.out.print("  ".repeat(i-1)); // 2 space
            int k = n-i-1; // tot numbers between starting and ending 1
            half = k % 2 != 0 ? (k/2)+1 : k/2; // for getting correct rounded value
            even = k % 2 == 0;
            prev = n-i;
            for (int j = i; j <= n; j++) {
                if(j == i || j == n) System.out.print("1"); // printing 1 in first and last only
                if(n-j != 1 && n-j != 0) {
                    System.out.print("   "); // 3 space
                    /** ODD */
                    if(k >= half && !even && (n-i-1) > 2) {
                        System.out.print(prev);
                        prev += 2;
                    } else if(k < half && !even  && (n-i-1) > 2) {
                        prev -= 2;
                        System.out.print(prev-2);
                    }
                    /** EVEN */
                    else if(k > half && even  && (n-i-1) > 2) {
                        System.out.print(prev);
                        prev += 2;
                    } else if(k < half && even  && (n-i-1) > 2) {
                        prev -= 2;
                        System.out.print(prev-2);
                    } else if(k == half && even && (n-i-1) > 2) {
                        System.out.print(prev-2);
                    }
                    /** COMMON */
                    else {
                        System.out.print(prev);
                    }
                } else {
                    System.out.print("   "); // 3 space
                }
                k--;
            }
            System.out.println();
        }
    }
}
