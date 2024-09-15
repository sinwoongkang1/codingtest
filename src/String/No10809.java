package String;


import java.util.Arrays;
import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] nums = new int[chars.length];

        Arrays.fill(nums, -1);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = 0; j < chars.length; j++) {
                if (currentChar == chars[j] && nums[j] == -1) {
                    nums[j] = i;
                }
            }
        }
        for(int n : nums) {
            System.out.print(n+" ");
        }
        sc.close();
    }
}
