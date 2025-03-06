package programmers;

import java.util.Arrays;

class P120880 {
    public static void main(String[] args) {
        int[] numlist1 = new int[]{1, 2, 3, 4, 5, 6};
        int n1 = 4;
        int[] answer1 = new int[]{4, 5, 3, 6, 2, 1};
        int[] result1 = new programmers.P120880().solution(numlist1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] numlist2 = new int[]{10000, 20, 36, 47, 40, 6, 10, 7000};
        int n2 = 30;
        int[] answer2 = new int[]{36, 40, 20, 47, 10, 6, 7000, 10000};
        int[] result2 = new programmers.P120880().solution(numlist2, n2);
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

    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] arr = new double[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] - n > 0) arr[i] = Math.abs(n - numlist[i]);
            else arr[i] = Math.abs(n - numlist[i]) + 0.5;
        }

        Arrays.sort(arr);

        for (int i = 0; i < numlist.length; i++) {
            if (arr[i] % 1 == 0) answer[i] = (int)arr[i] + n;
            else answer[i] = n - (int)arr[i];
        }

        return answer;
    }
}