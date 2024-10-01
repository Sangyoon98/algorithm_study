package programmers;

class P181938 {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 91;
        int answer1 = 364;
        int result1 = new programmers.P181938().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 91;
        int b2 = 2;
        int answer2 = 912;
        int result2 = new programmers.P181938().solution(a2, b2);
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

    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}