import java.io.*;
import java.util.Arrays;

public class No1286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfStudents = Integer.parseInt(br.readLine());
        int[][] arr = new int[numberOfStudents][5];

        for (int i = 0; i < numberOfStudents; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        bw.write(findMax(findStudent(arr, numberOfStudents)) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int[] findStudent(int[][] arr, int numberOfStudents) {
        int[] find = new int[numberOfStudents];
        Arrays.fill(find, 0);

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < numberOfStudents; k++) {
                for (int l = 0; l < numberOfStudents; l++) {
                    if (arr[k][j] == arr[l][j]) {
                        find[k]++;
                    }
                }
            }
        }
        return find;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i;
            }
        }
        return count + 1;
    }
}
