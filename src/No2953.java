import java.io.*;

public class No2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        int max = 0;
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                sum += Integer.parseInt(input[j]);
            }
            scores[i] = sum;
            if (scores[i] > max) {
                max = scores[i];
                count = i+1;
            }
        }
        bw.write(count+" "+max);
        bw.flush();
        bw.close();
        br.close();
    }
}
