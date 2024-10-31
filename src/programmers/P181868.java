package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181868 {
    public static void main(String[] args) {
        String my_string1 = " i love you";
        String[] answer1 = new String[]{"i", "love", "you"};
        String[] result1 = new programmers.P181868().solution(my_string1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = " programmers ";
        String[] answer2 = new String[]{"programmers"};
        String[] result2 = new programmers.P181868().solution(my_string2);
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
        ArrayList<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");

        for (String s : arr)
            if (s == null || !s.isEmpty()) list.add(s);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
        //return my_string.trim().split("[ ]+");
    }
}