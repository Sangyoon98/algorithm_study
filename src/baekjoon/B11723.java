package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int bitset = 0;

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num;

            switch (cmd) {
                case "add": {
                    num = Integer.parseInt(st.nextToken());
                    bitset |= (1 << (num - 1));
                    break;
                }
                case "remove": {
                    num = Integer.parseInt(st.nextToken());
                    bitset &= ~(1 << (num - 1));
                    break;
                }
                case "check": {
                    num = Integer.parseInt(st.nextToken());
                    sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;
                }
                case "toggle": {
                    num = Integer.parseInt(st.nextToken());
                    bitset ^= (1 << (num - 1));
                    break;
                }
                case "all": {
                    bitset |= (~0);
                    break;
                }
                case "empty": {
                    bitset &= 0;
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
