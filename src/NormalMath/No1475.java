package NormalMath;

import java.util.Scanner;

public class No1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[10];
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                intArr[9]++;
            } else {
                intArr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
            }
        }
        int max = 0;
        int val = 0;
        for (int i = 0; i <= 8; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        if (intArr[9]%2 !=0 ) {
            val = intArr[9]/2+1 ;
        } else {
            val = intArr[9]/2 ;
        }
        System.out.println(Math.max(val,max));
    }
}