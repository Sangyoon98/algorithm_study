package programmers;

class P120815 {
    public static void main(String[] args) {
        int n1 = 6;
        int answer1 = 1;
        int result1 = new programmers.P120815().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 10;
        int answer2 = 5;
        int result2 = new programmers.P120815().solution(n2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 4;
        int answer3 = 2;
        int result3 = new programmers.P120815().solution(n3);
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

    public int solution(int n) {
        return n / getGcd(n, 6);
    }

    public int getGcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return getGcd(num2, num1 % num2);
    }
}