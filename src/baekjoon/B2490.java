package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            int front = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreElements()) {
                if (Integer.parseInt(st.nextToken()) == 0) front++;
            }

            switch (front) {
                case 1:
                    bw.write("A\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("C\n");
                    break;
                case 4:
                    bw.write("D\n");
                    break;
                case 0:
                    bw.write("E\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}