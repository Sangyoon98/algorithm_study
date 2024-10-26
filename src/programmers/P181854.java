package programmers;

import java.util.Arrays;

class P181854 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{49, 12, 100, 276, 33};
        int n1 = 27;
        int[] answer1 = new int[]{76, 12, 127, 276, 60};
        int[] result1 = new programmers.P181854().solution(arr1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{444, 555, 666, 777};
        int n2 = 100;
        int[] answer2 = new int[]{444, 655, 666, 877};
        int[] result2 = new programmers.P181854().solution(arr2, n2);
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

    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i += 2)
                arr[i] += n;
        } else {
            for (int i = 0; i < arr.length; i += 2)
                arr[i] += n;
        }
        return arr;
    }
}