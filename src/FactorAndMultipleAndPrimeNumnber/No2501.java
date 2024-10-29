package FactorAndMultipleAndPrimeNumnber;

import java.io.*;
import java.util.ArrayList;

public class No2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if ((N % i) == 0) {
                numList.add(i);
            }
        }
        if (numList.size() >= K) {
            bw.write(numList.get(K-1) + "\n");
        }else{
            bw.write(0+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
