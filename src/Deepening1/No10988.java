package Deepening1;

import java.util.Scanner;

public class No10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(checkPalindrome(s));
    }
    public static int checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
