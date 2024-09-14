
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int distance = 0;
        int day = 0;

        for (int i = 1; i < v; i++) {
            distance = (i * a) - ((i - 1) * b);
            day++;
            if (distance >= v) {
                break;
            }
        }
        System.out.println(day);
    }
}