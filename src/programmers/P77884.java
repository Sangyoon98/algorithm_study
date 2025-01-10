package programmers;

class P77884 {
    public static void main(String[] args) {
        int left1 = 13;
        int right1 = 17;
        int answer1 = 43;
        int result1 = new programmers.P77884().solution(left1, right1);
        PRINT_RESULT(1, result1, answer1);

        int left2 = 24;
        int right2 = 27;
        int answer2 = 52;
        int result2 = new programmers.P77884().solution(left2, right2);
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

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (divisor(i) % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }

    public static int divisor(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        return count;
    }
}