package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 쇠막대기
public class B10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().replace("()", "R").split("");
        Stack<String> stack = new Stack<>();

        int total = 0;

        for (String s : input) {
            if (s.equals("(")) stack.push("(");
            else if (s.equals(")")) {
                stack.pop();
                total++;
            } else total += stack.size();
        }

        System.out.print(total);
    }
}