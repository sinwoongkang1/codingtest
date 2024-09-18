package Deepening1;

import java.io.*;

public class No25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalPoint = 0;
        double totalGrade = 0;
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double point = Double.parseDouble(input[1]);
            double grade;
            switch (input[2]) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0.0;
                    break;
                default:
                    grade = 9999;
                    break;
            }

            if(grade != 9999) {
                totalPoint += (point * grade);
                totalGrade += point;
            }
        }

        bw.write(String.valueOf(totalPoint/totalGrade));
        bw.flush();
    }
}