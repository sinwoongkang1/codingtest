package TwoDimensionArray;

import java.io.*;

public class No2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        int[][] arr = new int[N][M];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    arr[i][j] += Integer.parseInt(str[j]);
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
