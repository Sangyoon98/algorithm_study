package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int look = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int phone = Integer.parseInt(st.nextToken());

        bw.write((1 - king) + " " + (1 - queen) + " " + (2 - look) + " " + (2 - bishop) + " " + (2 - night) + " " + (8 - phone));
        bw.flush();
        bw.close();
        br.close();
    }
}
