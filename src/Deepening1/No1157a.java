package Deepening1;

import java.util.Scanner;

public class No1157a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];
        String str = in.next();

        for (int i = 0; i < str.length(); i++){

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            }

            else {
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char chr = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                chr = (char) (i + 65);
            }
            else if (arr[i] == max) {
                chr = '?';
            }
        }
        System.out.print(chr);
    }
}
