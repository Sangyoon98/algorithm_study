package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181886 {
    public static void main(String[] args) {
        String[] names1 = new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] answer1 = new String[]{"nami", "vex"};
        String[] result1 = new programmers.P181886().solution(names1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, String[] result, String[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i++)
            if (i % 5 == 0) answer.add(names[i]);

        return answer.toArray(new String[0]);
    }
}