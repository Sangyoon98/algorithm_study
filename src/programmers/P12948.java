package programmers;

class P12948 {
    public static void main(String[] args) {
        String phone_number1 = "01033334444";
        String answer1 = "*******4444";
        String result1 = new programmers.P12948().solution(phone_number1);
        PRINT_RESULT(1, result1, answer1);

        String phone_number2 = "027778888";
        String answer2 = "*****8888";
        String result2 = new programmers.P12948().solution(phone_number2);
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

    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for (int i = 0; i < phone_number.length() - 4; i++)
            sb.setCharAt(i, '*');

        return sb.toString();
    }
}