package String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr= Arrays.asList(sc.nextLine().split(" "));

        if (arr.isEmpty() || (arr.size() == 1 && arr.get(0).isEmpty())) {
            System.out.println(0);
            return;
        }

        int a = arr.size();
        if(arr.get(0).length()==0) {
            a -= 1;
        }
        if(arr.get(arr.size()-1).length()==0) {
            a -= 1;
        }
        System.out.println(a);
    }
}
