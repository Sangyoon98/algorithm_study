package programmers;

class P120585 {
    public static void main(String[] args) {
        int[] array1 = new int[]{149, 180, 192, 170};
        int height1 = 167;
        int answer1 = 3;
        int result1 = new programmers.P120585().solution(array1, height1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{180, 120, 140};
        int height2 = 190;
        int answer2 = 0;
        int result2 = new programmers.P120585().solution(array2, height2);
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

    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) if (i > height) answer++;
        return answer;
    }
}