package Array;

import java.util.Arrays;
import java.util.Scanner;

public class No2562 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] brr = arr.clone();
        Arrays.sort(brr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == brr[brr.length-1]) {
                count +=i;
            }
        }
        System.out.println(brr[brr.length-1]);
        System.out.println(count);
    }
}
