package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {
    static int N, M;
    static int[] card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N =  Integer.parseInt(br.readLine());

        card = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) card[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(card);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            bw.write(BinarySearch(num) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int BinarySearch(int num) {   // 이진/이분 탐색
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = card[middle];

            if (num > middleValue) {
                left = middle + 1;
            } else if (num < middleValue) {
                right = middle - 1;
            } else return 1;
        }
        return 0;
    }
}
