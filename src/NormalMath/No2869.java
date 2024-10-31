package NormalMath;
import java.io.*;

public class No2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long v = Long.parseLong(input[2]);

        long day = 0L;

        day = (v-b-1)/(a-b) +1 ;

        bw.write(day + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}