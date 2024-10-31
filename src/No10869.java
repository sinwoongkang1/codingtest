import java.io.*;

public class No10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        bw.write((N+M)+"\n"+(N-M)+"\n"+(N*M)+"\n"+(N/M)+"\n"+(N%M));
        bw.flush();
        bw.close();
        br.close();

    }
}
