package programmers;

import java.util.Arrays;

class P181867 {
    public static void main(String[] args) {
        String myString1 = "oxooxoxxox";
        int[] answer1 = new int[]{1, 2, 1, 0, 1, 0};
        int[] result1 = new programmers.P181867().solution(myString1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "xabcxdefxghi";
        int[] answer2 = new int[]{0, 3, 3, 3};
        int[] result2 = new programmers.P181867().solution(myString2);
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

    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }

        return answer;
    }
}