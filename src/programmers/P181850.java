package programmers;

class P181850 {
    public static void main(String[] args) {
        double flo1 = 1.42;
        int answer1 = 1;
        int result1 = new programmers.P181850().solution(flo1);
        PRINT_RESULT(1, result1, answer1);

        double flo2 = 69.32;
        int answer2 = 69;
        int result2 = new programmers.P181850().solution(flo2);
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

    public int solution(double flo) {
        return (int) flo;
    }
}