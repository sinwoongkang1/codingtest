package NormalMath;

import java.io.*;
import java.util.Arrays;

public class No4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int[] arr = new int[3];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            if (arr[0] == 0 || arr[1] == 0 || arr[2] == 0) {
                break;
            } else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                bw.write("right" + "\n");
            } else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) != Math.pow(arr[2], 2)) {
                bw.write("wrong" + "\n");
            }
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
