package programmers;

class P120868 {
    public static void main(String[] args) {
        int[] sides1 = new int[]{1, 2};
        int answer1 = 1;
        int result1 = new programmers.P120868().solution(sides1);
        PRINT_RESULT(1, result1, answer1);

        int[] sides2 = new int[]{3, 6};
        int answer2 = 5;
        int result2 = new programmers.P120868().solution(sides2);
        PRINT_RESULT(2, result2, answer2);

        int[] sides3 = new int[]{11, 7};
        int answer3 = 13;
        int result3 = new programmers.P120868().solution(sides3);
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

    public int solution(int[] sides) {
        int maxC = sides[0] + sides[1] - 1;
        int minC = Math.abs(sides[0] - sides[1]) + 1;
        return maxC - minC + 1;
    }
}