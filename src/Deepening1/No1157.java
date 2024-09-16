package Deepening1;

import java.util.Arrays;
import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = makeSmallArray(str);
        int[] arr = new int[strs.length];
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(findManyUsedAlphabet(strs,arr)));
        String a =findMaxIndex(findManyUsedAlphabet(strs, arr));
        System.out.println(strs[a].toUpperCase());

    }
    public static String[] makeSmallArray(String str){
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1).toLowerCase();
        }
        return arr;
    }
    public static int[] findManyUsedAlphabet(String[] arr,int[] intArr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    intArr[i] += 1 ;
                }
            }
        }
        return intArr;
    }
    public static String findMaxIndex(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }

        int maxValue = array[0];
        int maxCount = 1; // 최대값의 개수를 세기 위한 변수
        int maxIndex = 0; // 최대값의 인덱스

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxCount = 1; // 새로운 최대값 발견 시 개수 초기화
                maxIndex = i; // 새로운 최대값의 인덱스 업데이트
            } else if (array[i] == maxValue) {
                maxCount++; // 최대값과 같은 값을 발견하면 개수 증가
            }
        }

        // 최대값이 여러 번 발견된 경우
        if (maxCount > 1) {
            return "?";
        } else {
            return String.valueOf(maxIndex);
        }
    }

}

