package NormalMath;

import java.io.*;

public class No2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 2;
        for (int i = num; i > 0 ; i--) {
            int a = (int) Math.pow(2,num-i);
            sum += a;
        }
        bw.write(sum*sum+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
