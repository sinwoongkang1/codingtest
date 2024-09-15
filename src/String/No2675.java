package String;

import java.util.Scanner;

public class No2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String s = sc.next();
            printFiveTimes(a,s);
        }
    }
    public static void printFiveTimes(int a,String str){
        String[] split = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            split[i] = String.valueOf(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(split[i]);
            }
        }
        System.out.println();
    }
}
