package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181897 {
    public static void main(String[] args) {
        int n1 = 3;
        int[] slicer1 = new int[]{1, 5, 2};
        int[] num_list1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] answer1 = new int[]{2, 3, 4, 5, 6};
        int[] result1 = new programmers.P181897().solution(n1, slicer1, num_list1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 4;
        int[] slicer2 = new int[]{1, 5, 2};
        int[] num_list2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] answer2 = new int[]{2, 4, 6};
        int[] result2 = new programmers.P181897().solution(n2, slicer2, num_list2);
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

    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1: return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2: return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3: return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            default: {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    arr.add(num_list[i]);
                }
                return arr.stream().mapToInt(i -> i).toArray();
            }
        }
    }
}