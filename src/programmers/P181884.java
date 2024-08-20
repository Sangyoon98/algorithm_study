package programmers;

class P181884 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{34, 5, 71, 29, 100, 34};
        int n1 = 123;
        int answer1 = 139;
        int result1 = new programmers.P181884().solution(numbers1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{58, 44, 27, 10, 100};
        int n2 = 139;
        int answer2 = 239;
        int result2 = new programmers.P181884().solution(numbers2, n2);
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

    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            if (answer > n) break;
            answer += number;
        }
        return answer;
    }
}