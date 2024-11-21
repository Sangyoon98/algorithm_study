package programmers;

import java.util.Arrays;

class P42747 {
    public static void main(String[] args) {
        int[] citations1 = new int[]{3, 0, 6, 1, 5};
        int answer1 = 3;
        int result1 = new programmers.P42747().solution(citations1);
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

    public int solution(int[] citations) {
        int answer = 0;
        int total = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < total; i++) {
            int h_index = total - i;
            if (citations[i] >= h_index) {
                answer = h_index;
                break;
            }
        }
        return answer;
    }
}