package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P42586 {
    public static void main(String[] args) {
        int[] progresses1 = new int[]{93, 30, 55};
        int[] speeds1 = new int[]{1, 30, 5};
        int[] answer1 = new int[]{2, 1};
        int[] result1 = new programmers.P42586().solution(progresses1, speeds1);
        PRINT_RESULT(1, result1, answer1);

        int[] progresses2 = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds2 = new int[]{1, 1, 1, 1, 1, 1};
        int[] answer2 = new int[]{1, 3, 2};
        int[] result2 = new programmers.P42586().solution(progresses2, speeds2);
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

    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        while (progresses.length > 0) {
            for (int i = 0; i < progresses.length; i++) progresses[i] += speeds[i];

            int count = 0;
            while (progresses.length > 0 && progresses[0] >= 100) {
                count++;
                progresses = Arrays.copyOfRange(progresses, 1, progresses.length);
                speeds = Arrays.copyOfRange(speeds, 1, speeds.length);
            }
            if (count > 0) answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}