package programmers;

import java.util.Arrays;

class P120907 {
    public static void main(String[] args) {
        String[] quiz1 = new String[]{"3 - 4 = -3", "5 + 6 = 11"};
        String[] answer1 = new String[]{"X", "O"};
        String[] result1 = new programmers.P120907().solution(quiz1);
        PRINT_RESULT(1, result1, answer1);

        String[] quiz2 = new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer2 = new String[]{"O", "O", "X", "O"};
        String[] result2 = new programmers.P120907().solution(quiz2);
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

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split("=");
            String[] a = arr[0].split(" ");

            int real = (a[1].equals("+")) ? Integer.parseInt(a[0]) + Integer.parseInt(a[2]) : Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
            answer[i] = (real == Integer.parseInt(arr[1].replace(" ", ""))) ? "O" : "X";
        }

        return answer;
    }
}