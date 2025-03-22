package programmers;

import java.util.HashMap;

class P120812 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 3, 3, 4};
        int answer1 = 3;
        int result1 = new programmers.P120812().solution(array1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{1, 1, 2, 2};
        int answer2 = -1;
        int result2 = new programmers.P120812().solution(array2);
        PRINT_RESULT(2, result2, answer2);

        int[] array3 = new int[]{1};
        int answer3 = 1;
        int result3 = new programmers.P120812().solution(array3);
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

    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            int count = map.getOrDefault(i, 0) + 1;

            if (count > max) {
                max = count;
                answer = i;
            } else if (count == max) answer = -1;

            map.put(i, count);
        }

        return answer;
    }
}