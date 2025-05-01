package baekjoon;

import java.io.*;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 포켓몬 개수
        int M = Integer.parseInt(st.nextToken());   // 문제 개수

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String quiz = br.readLine();
            if (isInteger(quiz)) {  // 입력이 숫자인 경우
                sb.append(map1.get(Integer.parseInt(quiz))).append("\n");
            } else {    // 입력이 문자인 경우
                sb.append(map2.get(quiz)).append("\n");
            }
        }

        System.out.print(sb);
    }

    // 숫자 문자 판독
    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
