package programmers;

import java.util.Arrays;

public class P17681 {
    public static void main(String[] args) {
        int n1 = 5;
        int[] arr11 = {9, 20, 28, 18, 11};
        int[] arr12 = {30, 1, 21, 17, 28};
        String[] answer1 = {"#####", "# # #", "### #", "#  ##", "#####"};
        String[] result1 = new programmers.P17681().solution(n1, arr11, arr12);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 6;
        int[] arr21 = {46, 33, 33, 22, 31, 50};
        int[] arr22 = {27, 56, 19, 14, 14, 10};
        String[] answer2 = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        String[] result2 = new programmers.P17681().solution(n2, arr21, arr22);
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

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(" ", "0");

            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '0' && str2.charAt(j) == '0') sb.append(" ");
                else sb.append("#");
            }

            arr[i] = sb.toString();
        }

        /**
        for (int i = 0; i < n; i++) {
            arr[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]))
                    .replaceAll("1", "#")
                    .replaceAll("0", " ");
        }
        */

        return arr;
    }
}
