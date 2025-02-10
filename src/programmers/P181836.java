package programmers;

import java.util.Arrays;

class P181836 {
    public static void main(String[] args) {
        String[] picture1 = new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k1 = 2;
        String[] answer1 = new String[]{"..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"};
        String[] result1 = new programmers.P181836().solution(picture1, k1);
        PRINT_RESULT(1, result1, answer1);

        String[] picture2 = new String[]{"x.x", ".x.", "x.x"};
        int k2 = 3;
        String[] answer2 = new String[]{"xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"};
        String[] result2 = new programmers.P181836().solution(picture2, k2);
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

    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            StringBuilder sb = new StringBuilder();

            for (String s : arr)
                sb.append(s.repeat(k));

            for (int j = i * k; j <= (i * k) + k - 1; j++)
                answer[j] = sb.toString();
        }
        return answer;
    }
}