package Deepening1;

import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,8};
        Scanner sc = new Scanner(System.in);
        int[] brr = new int[arr.length];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = sc.nextInt();
        }
        compareArrays(arr, brr);
    }
    public static void compareArrays(int[] arr1, int[] arr2) {
        int[] crr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            crr[i] = arr1[i]-arr2[i];
            System.out.print(crr[i]+" ");
        }
    }
}
