package String;

import java.util.Scanner;

public class No5622 {
    public static void main(String[] args) {
        String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findMinTime(s,dial));
    }
    public static int findMinTime(String s, String[] strs){
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        int minTime = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].contains(arr[i])){
                    minTime += j+3;
                }
            }
        }
        return minTime;
    }
}
