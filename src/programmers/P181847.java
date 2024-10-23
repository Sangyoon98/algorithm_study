package programmers;

class P181847 {
    public static void main(String[] args) {
        String n_str1 = "0010";
        String answer1 = "10";
        String result1 = new programmers.P181847().solution(n_str1);
        PRINT_RESULT(1, result1, answer1);

        String n_str2 = "854020";
        String answer2 = "854020";
        String result2 = new programmers.P181847().solution(n_str2);
        PRINT_RESULT(2, result2, answer2);
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

    public String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
}