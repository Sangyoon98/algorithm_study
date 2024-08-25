package programmers;

class P120807 {
    public static void main(String[] args) {
        int num11 = 2;
        int num21 = 3;
        int answer1 = -1;
        int result1 = new P120807().solution(num11, num21);
        PRINT_RESULT(1, result1, answer1);

        int num12 = 11;
        int num22 = 11;
        int answer2 = 1;
        int result2 = new P120807().solution(num12, num22);
        PRINT_RESULT(2, result2, answer2);

        int num13 = 7;
        int num23 = 99;
        int answer3 = -1;
        int result3 = new P120807().solution(num13, num23);
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

    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }
}