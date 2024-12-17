package programmers;

class P181831 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int answer1 = 1;
        int result1 = new programmers.P181831().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[][] arr2 = new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        int answer2 = 0;
        int result2 = new programmers.P181831().solution(arr2);
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

    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }
}