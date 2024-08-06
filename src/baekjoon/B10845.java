package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int back = 0;

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.contains("push")) {
                st = new StringTokenizer(command);
                st.nextToken();
                back = Integer.parseInt(st.nextToken());
                queue.offer(back);
            } else if (command.contains("pop")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            } else if (command.contains("size")) {
                System.out.println(queue.size());
            } else if (command.contains("empty")) {
                if (queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (command.contains("front")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            } else if (command.contains("back")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(back);
            }
        }
    }
}
