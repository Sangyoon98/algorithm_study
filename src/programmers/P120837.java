package programmers;

class P120837 {
    public static void main(String[] args) {
        int hp1 = 23;
        int answer1 = 5;
        int result1 = new programmers.P120837().solution(hp1);
        PRINT_RESULT(1, result1, answer1);

        int hp2 = 24;
        int answer2 = 6;
        int result2 = new programmers.P120837().solution(hp2);
        PRINT_RESULT(2, result2, answer2);

        int hp3 = 999;
        int answer3 = 201;
        int result3 = new programmers.P120837().solution(hp3);
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

    public int solution(int hp) {
        return hp / 5 + (hp % 5) / 3 + ((hp % 5) % 3);
    }
}