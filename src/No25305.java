import java.io.*;
import java.util.Arrays;


public class No25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        String[] scores = br.readLine().split(" ");
        int[] scoresArr = new int[scores.length];
        for (int i = 0; i < N; i++) {
            scoresArr[i] = Integer.parseInt(scores[i]);
        }
        Arrays.sort(scoresArr);
        int cutIndex = (scoresArr.length -K);
        bw.write(scoresArr[cutIndex] + "\n");
        bw.flush();
        bw.close();
        br.close();
}
}
