
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        int distance = 0;
        int day = 0;

        for (int i = 1; i < v; i++) {
            distance = (i * a) - ((i - 1) * b);
            day++;
            if (distance >= v) {
                break;
            }
        }
        bw.write(day + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}