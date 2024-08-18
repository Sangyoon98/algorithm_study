package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloon = new int[N];
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            balloon[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");

        int move = balloon[0];

        for (int i = 1; i < N; i++) deque.add(new Balloon(i + 1, balloon[i]));

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) deque.add(deque.poll());
                Balloon next = deque.poll();
                move = next.numValue;
                sb.append(next.index).append(" ");
            } else {
                for (int i = 1; i < -move; i++) deque.addFirst(deque.pollLast());
                Balloon next = deque.pollLast();
                move = next.numValue;
                sb.append(next.index).append(" ");
            }
        }

        System.out.println(sb);
    }
}

class Balloon {
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}