package programmers;

class P12934 {
    public static void main(String[] args) {
        long n1 = 121L;
        long answer1 = 144L;
        long result1 = new programmers.P12934().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        long n2 = 3L;
        long answer2 = -1L;
        long result2 = new programmers.P12934().solution(n2);
        PRINT_RESULT(2, result2, answer2);
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

    public long solution(long n) {
        long answer = 0;
        if (Math.sqrt(n) % 1 == 0.0) answer = (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        else answer = -1;
        return answer;
    }
}