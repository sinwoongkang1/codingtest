package FactorAndMultipleAndPrimeNumnber;

import java.io.*;

public class No5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] input = br.readLine().split(" ");
            int F = Integer.parseInt(input[0]);
            int L = Integer.parseInt(input[1]);
            if (F < L && L % F == 0) {
                bw.write("factor" + "\n");
                bw.flush();
            } else if (F > L && F % L == 0) {
                bw.write("multiple" + "\n");
                bw.flush();
            } else if (F < L && L % F != 0 || F > L && F % L != 0) {
                bw.write("neither" + "\n");
                bw.flush();
            } else {
                bw.close();
                br.close();
                return;
            }
        }
    }
}
