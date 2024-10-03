package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P120850 {
    public static void main(String[] args) {
        String my_string1 = "hi12392";
        int[] answer1 = new int[]{1, 2, 2, 3, 9};
        int[] result1 = new programmers.P120850().solution(my_string1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "p2o4i8gj2";
        int[] answer2 = new int[]{2, 2, 4, 8};
        int[] result2 = new programmers.P120850().solution(my_string2);
        PRINT_RESULT(2, result2, answer2);

        String my_string3 = "abcde0";
        int[] answer3 = new int[]{0};
        int[] result3 = new programmers.P120850().solution(my_string3);
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

    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);

        for (char c : ch) {
            if (c >= '0' && c <= '9') answer.add(Integer.parseInt(String.valueOf(c)));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}