package String;

import java.util.Scanner;

public class No2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findWordLength(str));
    }
    public static int findWordLength(String str) {
        return str.length();
    }
}
