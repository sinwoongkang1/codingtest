package Deepening1;

import java.io.*;

public class No2444a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < Math.abs(i-(n-1)); j++) {
                bw.write(" ");
            }
            if(i <= n-1){
                for (int j = 0; j < 2*i+1  ; j++) {
                    bw.write("*");
                }
            } else if (i>=n) {
                for (int j = 0; j < -2*i+(4*n-3)  ; j++) {
                    bw.write("*");
                }
            }
            for (int j = 0; j < Math.abs(i-(n-1)); j++) {
                bw.write(" ");
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
