package Deepening1;

import java.io.*;
import java.util.Arrays;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strs = makeSmallArray(str);
        int[] arr = new int[strs.length];
        String a =findManyUsedAlphabet(strs, arr);
        if(a=="P"){
            bw.write("?"+"\n");

        }else{
            bw.write(strs[Integer.parseInt(a)].toUpperCase()+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static String[] makeSmallArray(String str){
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1).toLowerCase();
        }
        return arr;
    }
    public static String findManyUsedAlphabet(String[] str,int[] intArr){
        Arrays.fill(intArr,1);
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])){
                    intArr[i] += 1 ;
                }
            }
        }
        int maxValue = intArr[0];
        int maxCount = 1;
        int maxIndex = 0;
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > maxValue) {
                maxValue = intArr[i];
                maxCount = 1;
                maxIndex = i;
            } else if (intArr[i] == maxValue) {
                maxCount++;
            }
        }
        if (maxCount > 1) {
            return "P";
        } else {
            return String.valueOf(maxIndex);
        }
    }
}

