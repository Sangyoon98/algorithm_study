package programmers;

class P120885 {
    public static void main(String[] args) {
        String bin11 = "10";
        String bin21 = "11";
        String answer1 = "101";
        String result1 = new programmers.P120885().solution(bin11, bin21);
        PRINT_RESULT(1, result1, answer1);

        String bin12 = "1001";
        String bin22 = "1111";
        String answer2 = "11000";
        String result2 = new programmers.P120885().solution(bin12, bin22);
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

    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}