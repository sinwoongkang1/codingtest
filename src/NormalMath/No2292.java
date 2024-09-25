package NormalMath;

import java.io.*;

public class No2292 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;

        if (num == 1) {
        bw.write(count+"\n");
        }else {
            while (range <= num) {
                range += 6* count;
                count++;
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
        }
    }

