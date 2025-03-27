package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (!queue.isEmpty() && queue.peek() >= me) {
            ++me;
            queue.add(queue.poll() - 1);
            ++count;
        }

        System.out.print(count);
    }
}
