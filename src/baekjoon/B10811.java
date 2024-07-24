package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int a = 0; a < N; a++) {
            arr[a] = a + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            while (I < J) {
                int temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }

        for (int b : arr) {
            bw.write(b + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
