package programmers;

class P12912 {
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 5;
        long answer1 = 12L;
        long result1 = new programmers.P12912().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 3;
        int b2 = 3;
        long answer2 = 3L;
        long result2 = new programmers.P12912().solution(a2, b2);
        PRINT_RESULT(2, result2, answer2);

        int a3 = 5;
        int b3 = 3;
        long answer3 = 12L;
        long result3 = new programmers.P12912().solution(a3, b3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, long result, long answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) for (int i = b; i <= a; i++) answer += i;
        else if (a < b) for (int i = a; i <= b; i++) answer += i;
        else answer = a;
        return answer;
    }
}