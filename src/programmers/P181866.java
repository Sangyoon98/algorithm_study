package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class P181866 {
    public static void main(String[] args) {
        String myString1 = "axbxcxdx";
        String[] answer1 = new String[]{"a", "b", "c", "d"};
        String[] result1 = new programmers.P181866().solution(myString1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "dxccxbbbxaaaa";
        String[] answer2 = new String[]{"aaaa", "bbb", "cc", "d"};
        String[] result2 = new programmers.P181866().solution(myString2);
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

    public String[] solution(String myString) {
        String[] arr = myString.split("x+");
        ArrayList<String> answer = new ArrayList<>();

        for (String s : arr) {
            if (!s.isEmpty()) answer.add(s);
        }

        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
}