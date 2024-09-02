package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<String> left = new Stack<>();
            Stack<String> right = new Stack<>();
            String[] L = br.readLine().split("");

            for (String str : L) {
                switch (str) {
                    case "<":
                        if (!left.isEmpty()) right.push(left.pop());
                        break;
                    case ">":
                        if (!right.isEmpty())left.push(right.pop());
                        break;
                    case "-":
                        if (!left.isEmpty()) left.pop();
                        break;
                    default:
                        left.push(str);
                }
            }

            while (!left.isEmpty()) {
                right.push(left.pop());
            }

            while (!right.isEmpty()) {
                sb.append(right.pop());
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}