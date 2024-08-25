package programmers;

class P120820 {
    public static void main(String[] args) {
        int age1 = 40;
        int answer1 = 1983;
        int result1 = new programmers.P120820().solution(age1);
        PRINT_RESULT(1, result1, answer1);

        int age2 = 23;
        int answer2 = 2000;
        int result2 = new programmers.P120820().solution(age2);
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

    public int solution(int age) {
        return 2022 - age + 1;
    }
}