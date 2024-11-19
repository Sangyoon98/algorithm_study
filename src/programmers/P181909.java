package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class P181909 {
    public static void main(String[] args) {
        String my_string1 = "banana";
        String[] answer1 = new String[]{"a", "ana", "anana", "banana", "na", "nana"};
        String[] result1 = new programmers.P181909().solution(my_string1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "programmers";
        String[] answer2 = new String[]{"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"};
        String[] result2 = new programmers.P181909().solution(my_string2);
        PRINT_RESULT(2, result2, answer2);
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

    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++)
            answer.add(my_string.substring(i));

        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }
}