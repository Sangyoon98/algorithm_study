package programmers;

import java.util.Arrays;

class P86491 {
    public static void main(String[] args) {
        int[][] sizes1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer1 = 4000;
        int result1 = new programmers.P86491().solution(sizes1);
        PRINT_RESULT(1, result1, answer1);

        int[][] sizes2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int answer2 = 120;
        int result2 = new programmers.P86491().solution(sizes2);
        PRINT_RESULT(2, result2, answer2);

        int[][] sizes3 = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int answer3 = 133;
        int result3 = new programmers.P86491().solution(sizes3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(int[][] sizes) {
        int maxA = 0;
        int maxB = 0;

        for (int[] i : sizes) {
            Arrays.sort(i);
            if (maxA < i[0]) maxA = i[0];
            if (maxB < i[1]) maxB = i[1];
        }

        return maxA * maxB;
    }
}