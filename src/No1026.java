import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class No1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Integer[] arr1 = new Integer[num];
        String str1 = br.readLine();
        makeArray(arr1, str1);

        Integer[] arr2 = new Integer[num];
        String str2 = br.readLine();
        makeArray(arr2, str2);

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        bw.write(makeSmallInt(arr1,arr2) + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
    public static void makeArray(Integer[] arr, String str){
        String[] strs = str.split(" ");
        for(int i = 0; i < strs.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
    }

    public static int makeSmallInt(Integer[] arr, Integer[] arr2){
        int[] newArr = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i]*arr2[i];
            sum += newArr[i];
        }
        return sum;
    }
}
