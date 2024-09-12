package Loop;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = n/4;
        for (int i = 1; i <=m ; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
