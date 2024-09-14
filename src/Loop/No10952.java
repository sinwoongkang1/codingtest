package Loop;

import java.io.*;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean flag = true;
        while (flag) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if (a !=0 && b != 0) {
                bw.write((a+b)+"\n");
                bw.flush();

            } else{
                flag = false;
                bw.close();
                br.close();
            }
        }
    }
}
