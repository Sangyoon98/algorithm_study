package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B5430 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Deque<Integer> queue = new LinkedList<>();
            String[] p = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int j = 0; j < n; j++) queue.add(Integer.parseInt(st.nextToken()));

            AC(p, queue);
        }

        System.out.print(sb);
    }

    public static void AC(String[] commands, Deque<Integer> queue) {
        boolean isReverse = false;

        for (String command : commands) {
            if (command.equals("R")) {
                isReverse = !isReverse;
            } else {    // command = "D"
                if (isReverse) {
                    if (queue.pollLast() == null) {
                        sb.append("error\n");
                        return;
                    }
                }
                else {
                    if (queue.pollFirst() == null) {
                        sb.append("error\n");
                        return;
                    }
                }
            }
        }

        stringBuilder(isReverse, queue);
    }

    public static void stringBuilder(boolean isReverse, Deque<Integer> queue) {
        sb.append("[");

        if (!queue.isEmpty()) {
            if (isReverse) {
                sb.append(queue.pollLast());
                while (!queue.isEmpty()) {
                    sb.append(",").append(queue.pollLast());
                }
            } else {
                sb.append(queue.pollFirst());
                while (!queue.isEmpty()) {
                    sb.append(",").append(queue.pollFirst());
                }
            }
        }

        sb.append("]").append("\n");
    }
}