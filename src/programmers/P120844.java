package programmers;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class P120844 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3};
        String direction1 = "right";
        int[] answer1 = new int[]{3, 1, 2};
        int[] result1 = new programmers.P120844().solution(numbers1, direction1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        int[] answer2 = new int[]{455, 6, 4, -1, 45, 6, 4};
        int[] result2 = new programmers.P120844().solution(numbers2, direction2);
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

    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> queue = new LinkedList<>();
        for (int num : numbers) queue.add(num);
        if (direction.equals("right")) queue.addFirst(queue.pollLast());
        else queue.addLast(queue.pollFirst());
        return queue.stream().mapToInt(i -> i).toArray();
    }
}