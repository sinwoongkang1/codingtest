package String;

import java.util.Scanner;

public class No11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);
        int asciiValue = (int) inputChar;
        System.out.println(asciiValue);
        scanner.close();
    }
}

