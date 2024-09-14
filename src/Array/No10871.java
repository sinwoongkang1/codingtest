package Array;

import java.io.*;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String[] inputNumbers = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputNumbers[i]);
            if (arr[i] < min) {
                bw.write(arr[i] + " ");
                bw.flush();
            }
        }
        bw.close();
        br.close();
    }
}
