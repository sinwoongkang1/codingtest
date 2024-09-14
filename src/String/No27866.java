package String;

import java.util.Scanner;

public class No27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(splitString(str,num));

    }
    public static char splitString(String str,int num) {
       return str.charAt(num-1);
    }
}
