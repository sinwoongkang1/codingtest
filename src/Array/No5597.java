package Array;

import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length-2; i++) {
            int a = sc.nextInt();
            arr[a-1] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
