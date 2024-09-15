package String;

import java.util.*;

public class No2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        sc.nextLine();

        int[] arr = reverse(n);
        int[] brr = reverse(m);

        int a = makeInt(arr);
        int b = makeInt(brr);

        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static int[] reverse(String x) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < x.length(); i++) {
            chars.add(i, x.charAt(i));
        }
        Collections.reverse(chars);
        int[] arr = new int[chars.size()];
        for (int i = 0; i < chars.size(); i++) {
            arr[i] = chars.get(i)-48;
        }
        return arr;
    }
    public static int makeInt (int[] arr){
        int a =arr[0] * 100;
        int b = arr[1] * 10;
        int c = arr[2] ;
        return a + b + c;
    }
}
