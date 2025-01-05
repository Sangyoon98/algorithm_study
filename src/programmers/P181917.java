package programmers;

public class P181917 {
    public static void main(String[] args) {
        boolean x11 = false;
        boolean x12 = true;
        boolean x13 = true;
        boolean x14 = true;
        boolean answer1 = true;
        boolean result1 = new programmers.P181917().solution(x11, x12, x13, x14);
        PRINT_RESULT(1, result1, answer1);

        boolean x21 = true;
        boolean x22 = false;
        boolean x23 = false;
        boolean x24 = false;
        boolean answer2 = false;
        boolean result2 = new programmers.P181917().solution(x21, x22, x23, x24);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, boolean result, boolean answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
