package programmers;

class P120895 {
    public static void main(String[] args) {
        String my_string1 = "hello";
        int num11 = 1;
        int num21 = 2;
        String answer1 = "hlelo";
        String result1 = new programmers.P120895().solution(my_string1, num11, num21);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "I love you";
        int num12 = 3;
        int num22 = 6;
        String answer2 = "I l veoyou";
        String result2 = new programmers.P120895().solution(my_string2, num12, num22);
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

    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String[] answer = my_string.split("");
        answer[num1] = String.valueOf(my_string.charAt(num2));
        answer[num2] = String.valueOf(my_string.charAt(num1));
        for (String s : answer) sb.append(s);
        return sb.toString();
    }
}