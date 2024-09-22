package programmers;

class P120898 {
    public static void main(String[] args) {
        String message1 = "happy birthday!";
        int answer1 = 30;
        int result1 = new programmers.P120898().solution(message1);
        PRINT_RESULT(1, result1, answer1);

        String message2 = "I love you~";
        int answer2 = 22;
        int result2 = new programmers.P120898().solution(message2);
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

    public int solution(String message) {
        return message.length() * 2;
    }
}