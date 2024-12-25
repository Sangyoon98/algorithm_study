package programmers;

import java.util.Arrays;

class P181857 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] answer1 = new int[]{1, 2, 3, 4, 5, 6, 0, 0};
        int[] result1 = new programmers.P181857().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{58, 172, 746, 89};
        int[] answer2 = new int[]{58, 172, 746, 89};
        int[] result2 = new programmers.P181857().solution(arr2);
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

    public int[] solution(int[] arr) {
        int n = 0;
        while (arr.length > Math.pow(2, n)) n++;

        int[] answer = new int[(int)Math.pow(2, n)];
        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }
}