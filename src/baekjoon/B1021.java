package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        int count = 0;

        for (int i = 1; i <= N; i++) queue.offer(i);

        for (int i = 0; i < M; i++) {
            int target_idx = queue.indexOf(Integer.parseInt(st.nextToken()));
            int half_idx;

            if (queue.size() % 2 == 0) half_idx = queue.size() / 2 - 1;
            else half_idx = queue.size() / 2;

            if (target_idx <= half_idx) {
                for (int j = 0; j < target_idx; j++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    count++;
                }
            } else {
                for (int j = 0; j < queue.size() - target_idx; j++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    count++;
                }
            }
            queue.pollFirst();
        }

        System.out.print(count);
    }
}