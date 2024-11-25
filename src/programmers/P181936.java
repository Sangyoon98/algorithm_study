package programmers;

class P181936 {
    public static void main(String[] args) {
        int number1 = 60;
        int n1 = 2;
        int m1 = 3;
        int answer1 = 1;
        int result1 = new programmers.P181936().solution(number1, n1, m1);
        PRINT_RESULT(1, result1, answer1);

        int number2 = 55;
        int n2 = 10;
        int m2 = 5;
        int answer2 = 0;
        int result2 = new programmers.P181936().solution(number2, n2, m2);
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

    public int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}