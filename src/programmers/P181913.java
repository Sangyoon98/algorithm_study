package programmers;

class P181913 {
    public static void main(String[] args) {
        String my_string1 = "rermgorpsam";
        int[][] queries1 = new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String answer1 = "programmers";
        String result1 = new programmers.P181913().solution(my_string1, queries1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            String temp = sb.substring(query[0], query[1] + 1);
            StringBuilder revSb = new StringBuilder(temp).reverse();
            sb.replace(query[0], query[1] + 1, revSb.toString());
        }

        return sb.toString();
    }
}