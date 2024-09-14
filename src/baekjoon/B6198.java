package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B6198 {
    public static Stack<Integer> stack = new Stack<>();
    public static long answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());

            while (!stack.isEmpty()) {
                if (stack.peek() <= h) {
                    stack.pop();
                } else break;
            }
            answer += stack.size();
            stack.push(h);
        }

        System.out.println(answer);
    }
}