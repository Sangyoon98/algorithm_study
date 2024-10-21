package programmers;

class P181839 {
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 5;
        int answer1 = 34;
        int result1 = new programmers.P181839().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 6;
        int b2 = 1;
        int answer2 = 14;
        int result2 = new programmers.P181839().solution(a2, b2);
        PRINT_RESULT(2, result2, answer2);

        int a3 = 2;
        int b3 = 4;
        int answer3 = 2;
        int result3 = new programmers.P181839().solution(a3, b3);
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
        if (a % 2 == 1 && b % 2 == 1) return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        else if (a % 2 == 0 && b % 2 == 0) return Math.abs(a - b);
        else return 2 * (a + b);
    }
}