package programmers;

class P120843 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4};
        int k1 = 2;
        int answer1 = 3;
        int result1 = new programmers.P120843().solution(numbers1, k1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{1, 2, 3, 4, 5, 6};
        int k2 = 5;
        int answer2 = 3;
        int result2 = new programmers.P120843().solution(numbers2, k2);
        PRINT_RESULT(2, result2, answer2);

        int[] numbers3 = new int[]{1, 2, 3};
        int k3 = 3;
        int answer3 = 2;
        int result3 = new programmers.P120843().solution(numbers3, k3);
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

    public int solution(int[] numbers, int k) {
        return numbers[((k - 1) * 2) % numbers.length];
    }
}