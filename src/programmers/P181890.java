package programmers;

import java.util.Arrays;

class P181890 {
    public static void main(String[] args) {
        String[] str_list1 = new String[]{"u", "u", "l", "r"};
        String[] answer1 = new String[]{"u", "u"};
        String[] result1 = new programmers.P181890().solution(str_list1);
        PRINT_RESULT(1, result1, answer1);

        String[] str_list2 = new String[]{"l"};
        String[] answer2 = new String[]{""};
        String[] result2 = new programmers.P181890().solution(str_list2);
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

    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return answer;
    }
}