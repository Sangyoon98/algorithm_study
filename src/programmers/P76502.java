package programmers;

import java.util.Stack;

class P76502 {
    public static void main(String[] args) {
        String s1 = "[](){}";
        int answer1 = 3;
        int result1 = new programmers.P76502().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "}]()[{";
        int answer2 = 2;
        int result2 = new programmers.P76502().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = "[)(]";
        int answer3 = 0;
        int result3 = new programmers.P76502().solution(s3);
        PRINT_RESULT(3, result3, answer3);

        String s4 = "}}}";
        int answer4 = 0;
        int result4 = new programmers.P76502().solution(s4);
        PRINT_RESULT(4, result4, answer4);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i) + s.substring(0, i);

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty()) stack.push(c);
                else if (c == ')' && stack.peek() == '(') stack.pop();
                else if (c == '}' && stack.peek() == '{') stack.pop();
                else if (c == ']' && stack.peek() == '[') stack.pop();
                else stack.push(c);
            }

            if (stack.isEmpty()) answer++;
        }

        return answer;
    }
}