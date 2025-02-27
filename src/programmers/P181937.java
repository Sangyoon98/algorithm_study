package programmers;

class P181937 {
    public static void main(String[] args) {
        int num1 = 98;
        int n1 = 2;
        int answer1 = 1;
        int result1 = new programmers.P181937().solution(num1, n1);
        PRINT_RESULT(1, result1, answer1);

        int num2 = 34;
        int n2 = 3;
        int answer2 = 0;
        int result2 = new programmers.P181937().solution(num2, n2);
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

    public int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }
}