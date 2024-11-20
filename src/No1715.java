import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class No1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cardCount = Integer.parseInt(br.readLine());
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < cardCount; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(cards);
        int answer = 0;
        int sum = 0;
        while (cards.size() > 1) {
            Collections.sort(cards);
            answer += cards.get(0) + cards.get(1);
            sum = cards.get(0) + cards.get(1);
            cards.remove(0);
            cards.remove(0);
            cards.add(sum);
        }
        System.out.println(answer);
    }
}
