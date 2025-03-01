package programmers;

import java.util.Stack;

class P12973 {
    public static void main(String[] args) {
        String s1 = "baabaa";
        int answer1 = 1;
        int result1 = new programmers.P12973().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "cdcd";
        int answer2 = 0;
        int result2 = new programmers.P12973().solution(s2);
        PRINT_RESULT(2, result2, answer2);
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
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }

        return (stack.isEmpty()) ? 1 : 0;
    }
}