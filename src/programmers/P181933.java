package programmers;

class P181933 {
    public static void main(String[] args) {
        int a1 = -4;
        int b1 = 7;
        boolean flag1 = true;
        int answer1 = 3;
        int result1 = new P181933().solution(a1, b1, flag1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = -4;
        int b2 = 7;
        boolean flag2 = false;
        int answer2 = -11;
        int result2 = new P181933().solution(a2, b2, flag2);
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

    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}