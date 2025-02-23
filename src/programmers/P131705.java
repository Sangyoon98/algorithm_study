package programmers;

class P131705 {
    public static void main(String[] args) {
        int[] number1 = new int[]{-2, 3, 0, 2, -5};
        int answer1 = 2;
        int result1 = new programmers.P131705().solution(number1);
        PRINT_RESULT(1, result1, answer1);

        int[] number2 = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int answer2 = 5;
        int result2 = new programmers.P131705().solution(number2);
        PRINT_RESULT(2, result2, answer2);

        int[] number3 = new int[]{-1, 1, -1, 1};
        int answer3 = 0;
        int result3 = new programmers.P131705().solution(number3);
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

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
}