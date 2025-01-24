package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181918 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 2, 5, 3};
        int[] answer1 = new int[]{1, 2, 3};
        int[] result1 = new programmers.P181918().solution(arr1);
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
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            }
            else {
                if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                }
                else stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(j -> j).toArray();
    }
}