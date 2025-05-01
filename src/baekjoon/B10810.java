package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 바구니 개수
        int m = Integer.parseInt(st.nextToken());   // 공 넣는 숫자

        int[] array = new int[n];   // 바구니 배열

        for (int a = 0; a< m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int b = i - 1; b < j; b++) {
                array[b] = k;
            }
        }
        for (int c : array) {
            System.out.print(c + " ");
        }
        br.close();
    }
}
