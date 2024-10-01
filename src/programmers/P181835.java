package programmers;

import java.util.Arrays;

class P181835 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 100, 99, 98};
        int k1 = 3;
        int[] answer1 = new int[]{3, 6, 9, 300, 297, 294};
        int[] result1 = new programmers.P181835().solution(arr1, k1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{1, 2, 3, 100, 99, 98};
        int k2 = 2;
        int[] answer2 = new int[]{3, 4, 5, 102, 101, 100};
        int[] result2 = new programmers.P181835().solution(arr2, k2);
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

    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(i -> (k % 2 == 1) ? i * k : i + k).toArray();
    }
}