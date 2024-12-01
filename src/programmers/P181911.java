package programmers;

class P181911 {
    public static void main(String[] args) {
        String[] my_strings1 = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts1 = new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String answer1 = "programmers";
        String result1 = new programmers.P181911().solution(my_strings1, parts1);
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

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        return answer.toString();
    }
}