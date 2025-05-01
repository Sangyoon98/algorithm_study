package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 1; i <= n; i++) {  // 약수 구하기
                if (n % i == 0) {
                    arr.add(i);
                }
            }

            Collections.sort(arr);  // 오름차순 정렬
            arr.remove(arr.get(arr.size() - 1));    // n 자신의 숫자 제외

            int a = 0;
            for (int i : arr) a += i;   // 약수들의 합 구하기

            if (a != n) System.out.printf("%d is NOT perfect.\n", n);   // 완전수가 아닌 경우
            else {  // 완전수인 경우
                sb.append(n).append(" = ");
                for (int i = 0; i < arr.size(); i++) {
                    if (i == arr.size() - 1) sb.append(arr.get(i));
                    else sb.append(arr.get(i)).append(" + ");
                }
                sb.append("\n");
                System.out.print(sb);
            }
        }
    }
}
