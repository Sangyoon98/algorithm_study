package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();

            for (int j = 0; j < N; j++) {
                queue.add(new int[] { j, Integer.parseInt(st.nextToken()) });
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (front[1] < queue.get(j)[1]) {
                        queue.offer(front);
                        for (int k = 0; k < j; k++) queue.offer(queue.poll());
                        isMax = false;
                        break;
                    }
                }

                if (!isMax) continue;

                count++;

                if (front[0] == M) break;
            }

            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
