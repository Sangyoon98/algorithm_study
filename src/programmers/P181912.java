package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181912 {
    public static void main(String[] args) {
        String[] intStrs1 = new String[]{"0123456789", "9876543210", "9999999999999"};
        int k1 = 50000;
        int s1 = 5;
        int l1 = 5;
        int[] answer1 = new int[]{56789, 99999};
        int[] result1 = new programmers.P181912().solution(intStrs1, k1, s1, l1);
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

    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}