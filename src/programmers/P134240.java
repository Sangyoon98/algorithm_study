package programmers;

class P134240 {
    public static void main(String[] args) {
        int[] food1 = new int[]{1, 3, 4, 6};
        String answer1 = "1223330333221";
        String result1 = new programmers.P134240().solution(food1);
        PRINT_RESULT(1, result1, answer1);

        int[] food2 = new int[]{1, 7, 1, 2};
        String answer2 = "111303111";
        String result2 = new programmers.P134240().solution(food2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < food.length; i++) {
            if (food[i] > 1) sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        answer += sb.toString();
        answer += "0";
        answer += sb.reverse().toString();
        return answer;
    }
}