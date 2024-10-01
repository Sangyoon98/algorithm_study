package programmers;

import java.util.Arrays;

class P120899 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 8, 3};
        int[] answer1 = new int[]{8, 1};
        int[] result1 = new programmers.P120899().solution(array1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{9, 10, 11, 8};
        int[] answer2 = new int[]{11, 2};
        int[] result2 = new programmers.P120899().solution(array2);
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

    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}