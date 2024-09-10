package ConditionalStatement;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int minutes = sc.nextInt();
        int cookingTime = sc.nextInt();

        int realTime = (time*60 )+ minutes + cookingTime;
        int viewTime = realTime/60;
        int viewMinutes = realTime%60;

       if(viewTime>=24){
           viewTime=viewTime-24;
           System.out.println(viewTime+" "+viewMinutes);
       }else{
           System.out.println(viewTime+" "+viewMinutes);
       }
    }
}
