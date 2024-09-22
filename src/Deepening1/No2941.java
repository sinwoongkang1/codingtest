package Deepening1;

import java.io.*;

public class No2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;
        int i = 0;
        int length = str.length();

        while (i < length) {
            if (i < length - 2 && str.substring(i, i + 3).equals("dz=")) {
                count++;
                i += 3;
            } else if (i < length - 1 && (str.substring(i, i + 2).equals("c=") || str.substring(i, i + 2).equals("c-")
                    || str.substring(i, i + 2).equals("lj") || str.substring(i, i + 2).equals("nj") || str.substring(i, i + 2).equals("d-")
                    || str.substring(i, i + 2).equals("s=") || str.substring(i, i + 2).equals("z="))) {
                count++;
                i += 2;
            } else {
                count++;
                i++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
