import java.io.*;

import java.util.*;

public class No1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfSellBooks = Integer.parseInt(br.readLine());
        HashMap<String, Integer> countMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < numberOfSellBooks; i++) {
            String book = br.readLine();
            countMap.put(book, countMap.getOrDefault(book, 0) + 1);
            max = Math.max(max, countMap.get(book));
        }
        List<String> sameBooks = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() == max) {
                sameBooks.add(entry.getKey());
            }
            Collections.sort(sameBooks);
        }
        bw.write(sameBooks.get(0)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
