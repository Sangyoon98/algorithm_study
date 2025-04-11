package programmers;

class P136798 {
    public static void main(String[] args) {
        int number1 = 5;
        int limit1 = 3;
        int power1 = 2;
        int answer1 = 10;
        int result1 = new programmers.P136798().solution(number1, limit1, power1);
        PRINT_RESULT(1, result1, answer1);

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        int answer2 = 21;
        int result2 = new programmers.P136798().solution(number2, limit2, power2);
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

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) arr[j - 1]++;
        }

        for (int i : arr) {
            if (i > limit) answer += power;
            else answer += i;
        }

        return answer;
    }
}