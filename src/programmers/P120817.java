package programmers;

class P120817 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double answer1 = 5.5;
        double result1 = new programmers.P120817().solution(numbers1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer2 = 94.0;
        double result2 = new programmers.P120817().solution(numbers2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, double result, double answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public double solution(int[] numbers) {
        double answer = 0;
        for (int i : numbers) answer += i;
        answer /= numbers.length;
        return answer;
    }
}