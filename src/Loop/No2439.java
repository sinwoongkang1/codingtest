package Loop;

import java.io.*;

public class No2439  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num-i; j++) {
                bw.write(" ");
                bw.flush();
            }
            for (int j = 0; j < i; j++) {
                bw.write("*");
                bw.flush();
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
