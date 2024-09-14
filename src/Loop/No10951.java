package Loop;

import java.io.*;

public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(" ");
            int n = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            if (n == 0 || m == 0) {
                break;
            } else {
                bw.write((n + m) + "\n");
                bw.flush();
            }
        }

        bw.close();
        br.close();
    }
}
