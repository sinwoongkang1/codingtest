import java.io.*;

public class No1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        int mun = num;
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mun%2;
            mun/=2;
        }
        bw.write(findNumberOne(arr)+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
    public static int findNumberOne(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}
