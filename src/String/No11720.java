package String;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Character.getNumericValue(a.charAt(i));
        }
        System.out.println(sum);
        sc.close();
    }
}