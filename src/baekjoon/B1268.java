package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        int max = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> student = new HashSet<>();

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i][j] == arr[k][j] && k != i) student.add(k);
                }
                if (student.size() > max) {
                    max = student.size();
                    answer = i;
                }
            }
        }

        System.out.print(answer + 1);
    }
}