package NormalMath;

import java.io.*;

public class No2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String str = input[0];
        int a = Integer.parseInt(input[1]);
        int s ;
        long sum = 0;
        int jisu = str.length()-1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>=48 && c<=57) {
             s = c-48;
            }else {
                s = c-55;
            }
            sum += s * Math.pow(a,jisu);
            jisu--;
        }

        bw.write(sum+"\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
