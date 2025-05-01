package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (stack.empty()) bw.write(-1 + "\n");
                    else bw.write(stack.pop() + "\n");
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.empty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case 5:
                    if (stack.empty()) bw.write(-1 + "\n");
                    else bw.write(stack.peek() + "\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
