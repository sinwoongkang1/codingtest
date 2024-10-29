package FactorAndMultipleAndPrimeNumnber;

import java.io.*;
import java.util.ArrayList;

public class No9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        while (flag) {
            ArrayList<Integer> numList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && n != i) {
                    numList.add(i);
                }
            }
            if (n == sumOfArrayList(numList)) {
                bw.write(n+" = ");
                for (int i = 0; i < numList.size(); i++) {
                    if(i != numList.size()){
                        bw.write(numList.get(i)+" ");
                    }
                    if (i != numList.size()-1) {
                        bw.write("+ ");
                    }
                    }
                bw.write("\n");
            } else if (n == -1) {
                flag = false;
            } else {
                bw.write(n+" is NOT perfect."+"\n");
            }
            bw.flush();
        }
        bw.close();
        br.close();
    }
    public static int sumOfArrayList(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }
}
