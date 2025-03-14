package programmers;

class P132267 {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 1;
        int n1 = 20;
        int answer1 = 19;
        int result1 = new programmers.P132267().solution(a1, b1, n1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 3;
        int b2 = 1;
        int n2 = 20;
        int answer2 = 9;
        int result2 = new programmers.P132267().solution(a2, b2, n2);
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

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n / a > 0) {
            answer += n / a * b;
            n = n / a * b + n % a;
        }

        return answer;
    }
}