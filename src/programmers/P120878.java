package programmers;

class P120878 {
    public static void main(String[] args) {
        int a1 = 7;
        int b1 = 20;
        int answer1 = 1;
        int result1 = new programmers.P120878().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 11;
        int b2 = 22;
        int answer2 = 1;
        int result2 = new programmers.P120878().solution(a2, b2);
        PRINT_RESULT(2, result2, answer2);

        int a3 = 12;
        int b3 = 21;
        int answer3 = 2;
        int result3 = new programmers.P120878().solution(a3, b3);
        PRINT_RESULT(3, result3, answer3);
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
        int answer = b / gcd(a, b);

        while (answer != 1) {
            if (answer % 2 == 0) answer /= 2;
            else if (answer % 5 == 0) answer /= 5;
            else return 2;
        }

        return 1;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}