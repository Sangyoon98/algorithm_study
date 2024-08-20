package programmers;

import java.util.Arrays;

class P181882 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 100, 99, 98};
        int[] answer1 = new int[]{2, 2, 6, 50, 99, 49};
        int[] result1 = new programmers.P181882().solution(arr1);
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

    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] = arr[i] / 2;
            else if (arr[i] <= 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2;
        }
        return arr;
    }
}