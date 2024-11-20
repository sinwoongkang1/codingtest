import java.io.*;
import java.util.ArrayList;

public class No1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        ArrayList<Integer> stack = makeArray(N,M);
        int sum = sliceSum(stack,N,M);
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int sliceSum(ArrayList<Integer> array, int a, int b) {
        int sum = 0;
        for (int i = a-1; i < b; i++) {
            sum += array.get(i);
        }
        return sum;
    }

    public static ArrayList<Integer> makeArray(int a, int b) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <=b ; i++) {
            for (int j = 0; j < i; j++) {
                arr.add(i);
            }
        }
        return arr;

    }
}
