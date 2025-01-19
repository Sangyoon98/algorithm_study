package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181859 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 1, 1, 0};
        int[] answer1 = new int[]{0, 1, 0};
        int[] result1 = new programmers.P181859().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{0, 1, 0, 1, 0};
        int[] answer2 = new int[]{0, 1, 0, 1, 0};
        int[] result2 = new programmers.P181859().solution(arr2);
        PRINT_RESULT(2, result2, answer2);

        int[] arr3 = new int[]{0, 1, 1, 0};
        int[] answer3 = new int[]{-1};
        int[] result3 = new programmers.P181859().solution(arr3);
        PRINT_RESULT(3, result3, answer3);
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
        ArrayList<Integer> stk = new ArrayList<>();

        for (int j : arr) {
            if (stk.isEmpty()) stk.add(j);
            else {
                if (stk.get(stk.size() - 1) == j) stk.remove(stk.size() - 1);
                else stk.add(j);
            }
        }

        if (stk.isEmpty()) return new int[] { -1 };
        return stk.stream().mapToInt(i -> i).toArray();
    }
}