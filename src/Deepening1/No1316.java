package Deepening1;

import java.io.*;

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            checkingGroupWord(str,num);
        }
        bw.write(num+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void checkingGroupWord(String str, int num) {
        int[] arr = new int[26];
        int prev = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==prev){
                arr[str.charAt(i)-'a']++;
                prev = arr[str.charAt(i)-'a'];
            }else {
                num--;
                break;
            }
            }
        }
}
