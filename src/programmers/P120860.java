package programmers;

class P120860 {
    public static void main(String[] args) {
        int[][] dots1 = new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int answer1 = 1;
        int result1 = new programmers.P120860().solution(dots1);
        PRINT_RESULT(1, result1, answer1);

        int[][] dots2 = new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int answer2 = 4;
        int result2 = new programmers.P120860().solution(dots2);
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

    public int solution(int[][] dots) {
        int start = dots[0][0];
        int width = 0;
        int height = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] == start) height = Math.abs(dots[i][1] - dots[0][1]);
            else width = Math.abs(dots[i][0] - dots[0][0]);
        }

        return width * height;
    }
}