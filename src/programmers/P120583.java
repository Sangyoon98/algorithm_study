package programmers;

class P120583 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 1, 2, 3, 4, 5};
        int n1 = 1;
        int answer1 = 2;
        int result1 = new programmers.P120583().solution(array1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{0, 2, 3, 4};
        int n2 = 1;
        int answer2 = 0;
        int result2 = new programmers.P120583().solution(array2, n2);
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

    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) if (i == n) answer++;
        return answer;
    }
}