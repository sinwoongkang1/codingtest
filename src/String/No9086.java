package String;

import java.util.Scanner;

public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.print(firstWord(str));
            System.out.print(lastWord(str));
            System.out.println();
        }
    }
    public static char firstWord(String str) {
        char a = str.charAt(0);
        return a;
    }
    public static char lastWord(String str) {
        char a = str.charAt(str.length()-1);
        return a;
    }
}
