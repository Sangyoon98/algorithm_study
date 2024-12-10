package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181895 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[][] intervals1 = new int[][]{{1, 3}, {0, 4}};
        int[] answer1 = new int[]{2, 3, 4, 1, 2, 3, 4, 5};
        int[] result1 = new programmers.P181895().solution(arr1, intervals1);
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

    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}