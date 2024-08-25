package programmers;

public class P120804 {
    public static void main(String[] args) {
        int num11 = 3;
        int num21 = 4;
        int answer1 = 12;
        int result1 = new programmers.P120804().solution(num11, num21);
        PRINT_RESULT(1, result1, answer1);

        int num12 = 27;
        int num22 = 19;
        int answer2 = 513;
        int result2 = new programmers.P120804().solution(num12, num22);
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
        return num1 * num2;
    }
}
