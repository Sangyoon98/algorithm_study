package programmers;

class P120903 {
    public static void main(String[] args) {
        String[] s11 = new String[]{"a", "b", "c"};
        String[] s21 = new String[]{"com", "b", "d", "p", "c"};
        int answer1 = 2;
        int result1 = new programmers.P120903().solution(s11, s21);
        PRINT_RESULT(1, result1, answer1);

        String[] s12 = new String[]{"n", "omg"};
        String[] s22 = new String[]{"m", "dot"};
        int answer2 = 0;
        int result2 = new programmers.P120903().solution(s12, s22);
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

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String ss : s2) {
                if (s.equals(ss)) answer++;
            }
        }
        return answer;
    }
}