package Array;

import java.util.Arrays;
import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num%42;
        }
        System.out.println(Arrays.stream(arr).distinct().count());
    }
}
