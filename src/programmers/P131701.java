package programmers;

import java.util.HashSet;

class P131701 {
    public static void main(String[] args) {
        int[] elements1 = new int[]{7, 9, 1, 1, 4};
        int answer1 = 18;
        int result1 = new programmers.P131701().solution(elements1);
        PRINT_RESULT(1, result1, answer1);
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

    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += elements[(i + j) % elements.length];
                set.add(sum);
            }
        }

        return set.size();
    }
}