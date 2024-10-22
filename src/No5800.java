import java.io.*;
import java.util.Arrays;

public class No5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int classNumber = Integer.parseInt(br.readLine());

        for (int i = 0; i < classNumber; i++) {
            String[] arr = br.readLine().split(" ");
            int[] brr= new int[Integer.parseInt(arr[0])];
            for (int j = 0; j < brr.length; j++) {
                brr[j] = Integer.parseInt(arr[j+1]);
            }
            Arrays.sort(brr);
            bw.write("Class "+(i+1)+"\n");
            bw.write("Max "+brr[brr.length-1]+", "+"Min "+brr[0]+", "+"Largest gap "+(findLargestGap(brr))+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    public static int findLargestGap(int[] arr) {
        int largestGap = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]-arr[i-1] > largestGap) {
                largestGap = arr[i]-arr[i-1];
            }
        }
        return largestGap;
    }
}
