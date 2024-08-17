package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] line = new int[N];

        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(CheckNum(line));
    }

    public static String CheckNum(int[] line) {
        int val = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < line.length; i++) {
            if (line[i] != val) {
                if (!stack.isEmpty() && stack.peek() == val) {
                    stack.pop();
                    i--;
                    val++;
                } else stack.push(line[i]);
            } else val++;
        }

        boolean result = true;

        for (int i = 0; i < stack.size(); i++) {
            int value = stack.pop();
            if (value == val) val++;
            else result = false;
            break;
        }

        return result ? "Nice" : "Sad";
    }
}
