import java.io.*;
import java.util.Arrays;

public class No1286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int grade = Integer.parseInt(br.readLine());
        int[][] arr = new int[grade][grade];

        for (int i = 0; i < grade; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < grade; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
public static void findStudent(int[][] arr) {
        int[] find = new int[5];
        Arrays.fill(find, -5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == arr[i][j]) {
                    find[j]++;
                }
            }
        }

}
}
