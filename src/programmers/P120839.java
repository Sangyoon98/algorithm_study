package programmers;

class P120839 {
    public static void main(String[] args) {
        String rsp1 = "2";
        String answer1 = "0";
        String result1 = new programmers.P120839().solution(rsp1);
        PRINT_RESULT(1, result1, answer1);

        String rsp2 = "205";
        String answer2 = "052";
        String result2 = new programmers.P120839().solution(rsp2);
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

    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            if (c == '2') sb.append("0");
            else if (c == '0') sb.append("5");
            else sb.append("2");
        }
        return sb.toString();
    }
}