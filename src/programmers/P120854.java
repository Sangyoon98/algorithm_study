package programmers;

import java.util.Arrays;

class P120854 {
    public static void main(String[] args) {
        String[] strlist1 = new String[]{"We", "are", "the", "world!"};
        int[] answer1 = new int[]{2, 3, 3, 6};
        int[] result1 = new programmers.P120854().solution(strlist1);
        PRINT_RESULT(1, result1, answer1);

        String[] strlist2 = new String[]{"I", "Love", "Programmers."};
        int[] answer2 = new int[]{1, 4, 12};
        int[] result2 = new programmers.P120854().solution(strlist2);
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

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++)
            answer[i] = strlist[i].length();

        return answer;
    }
}