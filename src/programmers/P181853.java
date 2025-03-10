package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181853 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{12, 4, 15, 46, 38, 1, 14};
        int[] answer1 = new int[]{1, 4, 12, 14, 15};
        int[] result1 = new programmers.P181853().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++)
            answer.add(num_list[i]);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}