package programmers;

class P12985 {
    public static void main(String[] args) {
        int n1 = 8;
        int a1 = 4;
        int b1 = 7;
        int answer1 = 3;
        int result1 = new programmers.P12985().solution(n1, a1, b1);
        PRINT_RESULT(1, result1, answer1);
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

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }

        return answer;
    }
}
