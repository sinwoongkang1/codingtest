package Loop;

import java.io.*;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String[] input = br.readLine().split(" ");
            int b = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            bw.write((b + c) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
