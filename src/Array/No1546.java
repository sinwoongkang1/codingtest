package Array;

import java.util.Arrays;
import java.util.Scanner;

public class No1546 {
    public static int findMaxScore(int[] array){
        Arrays.sort(array);
        int maxScore = array[array.length-1];
        return maxScore;
    }
    public static void makeAverageArray(int[] array,double a){
        double[] array2 = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<=a){
                array2[i]=(array[i]/a)*100;}
        }
        double sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        double result = sum / array2.length;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] firstExamScores = new int[n];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            firstExamScores[i]=m;
        }
        double score1 = findMaxScore(firstExamScores);
        makeAverageArray(firstExamScores,score1);
    }
}