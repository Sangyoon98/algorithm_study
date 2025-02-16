package programmers;

import java.util.Arrays;

class P70129 {
    public static void main(String[] args) {
        String s1 = "110010101001";
        int[] answer1 = new int[]{3, 8};
        int[] result1 = new programmers.P70129().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "01110";
        int[] answer2 = new int[]{3, 3};
        int[] result2 = new programmers.P70129().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = "1111111";
        int[] answer3 = new int[]{4, 1};
        int[] result3 = new programmers.P70129().solution(s3);
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

    public int[] solution(String s) {
        String result = s;
        int count = 0;
        int zero = 0;

        while (!result.equals("1")) {
            String str = result.replace("0", "");
            zero += result.length() - str.length();
            result = Integer.toBinaryString(str.length());
            count++;
        }

        return new int[] { count, zero };
    }
}