package NormalMath;

import java.util.Scanner;

public class No2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            makeExchange(sc.nextInt());
            System.out.println();
        }
    }
    public static void makeExchange(int money){
        int[] arr = new int[4];
        arr[0] = money/25;
        arr[1] = (money%25)/10;
        arr[2] = ((money%25)%10)/5;
        arr[3] = (((money%25)%10)%5)/1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
