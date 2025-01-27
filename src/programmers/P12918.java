package programmers;

class P12918 {
    public static void main(String[] args) {
        String s1 = "a234";
        boolean answer1 = false;
        boolean result1 = new programmers.P12918().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "1234";
        boolean answer2 = true;
        boolean result2 = new programmers.P12918().solution(s2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, boolean result, boolean answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            answer = true;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}