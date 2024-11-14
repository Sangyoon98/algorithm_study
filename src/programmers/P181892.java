package programmers;

import java.util.Arrays;

class P181892 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{2, 1, 6};
        int n1 = 3;
        int[] answer1 = new int[]{6};
        int[] result1 = new programmers.P181892().solution(num_list1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{5, 2, 1, 7, 5};
        int n2 = 2;
        int[] answer2 = new int[]{2, 1, 7, 5};
        int[] result2 = new programmers.P181892().solution(num_list2, n2);
        PRINT_RESULT(2, result2, answer2);
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

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}