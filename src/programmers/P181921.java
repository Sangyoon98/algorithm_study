package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181921 {
    public static void main(String[] args) {
        int l1 = 5;
        int r1 = 555;
        int[] answer1 = new int[]{5, 50, 55, 500, 505, 550, 555};
        int[] result1 = new programmers.P181921().solution(l1, r1);
        PRINT_RESULT(1, result1, answer1);

        int l2 = 10;
        int r2 = 20;
        int[] answer2 = new int[]{-1};
        int[] result2 = new programmers.P181921().solution(l2, r2);
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

    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int temp = i;
            boolean flag = true;

            while (temp > 0) {
                int t = temp % 10;
                if (!(t == 0 || t == 5)) {
                    flag = false;
                    break;
                }
                temp /= 10;
            }

            if (flag) arr.add(i);
        }

        if (arr.isEmpty()) return new int[] {-1};
        return arr.stream().mapToInt(i -> i).toArray();
    }
}