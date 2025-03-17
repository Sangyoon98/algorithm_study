package programmers;

import java.util.Arrays;

class P42885 {
    public static void main(String[] args) {
        int[] people1 = new int[]{70, 50, 80, 50};
        int limit1 = 100;
        int answer1 = 3;
        int result1 = new programmers.P42885().solution(people1, limit1);
        PRINT_RESULT(1, result1, answer1);

        int[] people2 = new int[]{70, 80, 50};
        int limit2 = 100;
        int answer2 = 3;
        int result2 = new programmers.P42885().solution(people2, limit2);
        PRINT_RESULT(2, result2, answer2);
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

    public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;
        Arrays.sort(people);

        while (left < right) {
            if (people[left] + people[right] <= limit) left++;
            right--;
            answer++;
        }

        return left == right ? answer + 1 : answer;
    }
}