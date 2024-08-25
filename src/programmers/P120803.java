package programmers;

public class P120803 {
    public static void main(String[] args) {
        int num11 = 2;
        int num21 = 3;
        int answer1 = -1;
        int result1 = new programmers.P120803().solution(num11, num21);
        PRINT_RESULT(1, result1, answer1);

        int num12 = 100;
        int num22 = 2;
        int answer2 = 98;
        int result2 = new programmers.P120803().solution(num12, num22);
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

    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}
