package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            Stack<String> stack = new Stack<>();

            for (String j : arr) {
                if (stack.isEmpty()) stack.add(j);
                else {
                    if (stack.peek().equals(j)) stack.pop();
                    else stack.add(j);
                }
            }

            if (stack.isEmpty()) count++;
        }

        System.out.print(count);
    }
}
