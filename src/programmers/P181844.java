package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181844 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{293, 1000, 395, 678, 94};
        int[] delete_list1 = new int[]{94, 777, 104, 1000, 1, 12};
        int[] answer1 = new int[]{293, 395, 678};
        int[] result1 = new programmers.P181844().solution(arr1, delete_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{110, 66, 439, 785, 1};
        int[] delete_list2 = new int[]{377, 823, 119, 43};
        int[] answer2 = new int[]{110, 66, 439, 785, 1};
        int[] result2 = new programmers.P181844().solution(arr2, delete_list2);
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

    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) answer.add(i);

        for (int i : arr) {
            for (int d : delete_list) {
                if (i == d) answer.remove(Integer.valueOf(i));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}