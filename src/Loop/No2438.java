package Loop;

import java.io.*;

public class No2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
                bw.flush();
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
