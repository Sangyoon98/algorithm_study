package programmers;

import java.util.*;

class P68644 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{2, 1, 3, 4, 1};
        int[] answer1 = new int[]{2, 3, 4, 5, 6, 7};
        int[] result1 = new programmers.P68644().solution(numbers1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{5, 0, 2, 7};
        int[] answer2 = new int[]{2, 5, 7, 9, 12};
        int[] result2 = new programmers.P68644().solution(numbers2);
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

    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> arr = new ArrayList<>(answer);
        Collections.sort(arr);

        return arr.stream().mapToInt(i -> i).toArray();
    }
}