package programmers;

import java.util.Arrays;

class B181888 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{4, 2, 6, 1, 7, 6};
        int n1 = 2;
        int[] answer1 = new int[]{4, 6, 7};
        int[] result1 = new programmers.B181888().solution(num_list1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{4, 2, 6, 1, 7, 6};
        int n2 = 4;
        int[] answer2 = new int[]{4, 7};
        int[] result2 = new programmers.B181888().solution(num_list2, n2);
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
        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int idx = 0;
        int[] answer = new int[N];
        for (int i = 0;i < num_list.length;i+=n)
            answer[idx++] = num_list[i];
        return answer;
    }
}