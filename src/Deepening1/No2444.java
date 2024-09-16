package Deepening1;

import java.util.Scanner;

public class No2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = n-j; i > 0; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * n - 1; i+=2) {
                System.out.print("*");
            }
            for (int i = n-j; i > 0; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
