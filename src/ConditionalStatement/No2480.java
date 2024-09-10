package ConditionalStatement;

import java.util.Scanner;

public class No2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && a==c){
            System.out.println(10000+(a*1000));
        }
        if((a==b && a!=c)||(b==c && b!=a)||(c==a && c!=b)){
            if(a==b){
                a=a;
            }if(b==c){
                a=b;
            }if(c==a){
                a=c;
            }
            System.out.println(1000+(a*100));
        }
        if(a!=b && a!=c && b!=c){
            a = Math.max(a,b);
            a = Math.max(a,c);
            System.out.println(a*100);
        }
    }
}
