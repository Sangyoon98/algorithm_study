package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][N];
        int width = 0;
        int height = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j].equals(".")) count++;
                else {
                    if (count >= 2) width++;
                    count = 0;
                }
            }
            if (count >= 2) width++;
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i].equals(".")) count++;
                else {
                    if (count >= 2) height++;
                    count = 0;
                }
            }
            if (count >= 2) height++;
        }

        System.out.print(width + " " + height);
    }
}