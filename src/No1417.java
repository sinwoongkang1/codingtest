import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No1417
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int me = sc.nextInt();
        Integer arr[] = new Integer[N-1];
        int count = 0;
        for(int i = 0; i < arr.length; ++i) arr[i] = sc.nextInt();
        while(true)
        {
            Arrays.sort(arr, Collections.reverseOrder());
            if(N == 1 || arr[0] < me) break;
            else
            {
                ++me;
                --arr[0];
                ++count;
            }
        }
        System.out.print(count);
    }
}