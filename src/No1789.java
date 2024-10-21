import java.util.Scanner;

public class No1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long n = 1L;
        boolean flag = true;
        while (flag) {
            if(n*(n+1)>2*S){
                System.out.println(n-1);
                flag = false;
            }else{
                n++;
            }
        }
    }
}
