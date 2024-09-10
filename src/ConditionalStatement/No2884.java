package ConditionalStatement;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int minutes = sc.nextInt();

        if (minutes - 45 >=0) {
            System.out.print(time+" ");
            System.out.println(minutes-45);
        }
        if (minutes - 45 <0) {
            time -= 1;
            if (time < 0) {
                System.out.print(24+time+" ");
                System.out.println(60-(45-minutes));
            }else {
                System.out.print(time + " ");
                System.out.println(60 - (45 - minutes));
            }
        }
    }
}
