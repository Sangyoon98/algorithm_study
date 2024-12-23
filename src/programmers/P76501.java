package programmers;

class P76501 {
    public static void main(String[] args) {
        int[] absolutes1 = new int[]{4, 7, 12};
        boolean[] signs1 = new boolean[]{true, false, true};
        int answer1 = 9;
        int result1 = new programmers.P76501().solution(absolutes1, signs1);
        PRINT_RESULT(1, result1, answer1);

        int[] absolutes2 = new int[]{1, 2, 3};
        boolean[] signs2 = new boolean[]{false, false, true};
        int answer2 = 0;
        int result2 = new programmers.P76501().solution(absolutes2, signs2);
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

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++)
            if (!signs[i]) absolutes[i] *= -1;

        for (int i : absolutes) answer += i;

        return answer;
    }
}