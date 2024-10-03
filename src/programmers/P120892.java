package programmers;

class P120892 {
    public static void main(String[] args) {
        String cipher1 = "dfjardstddetckdaccccdegk";
        int code1 = 4;
        String answer1 = "attack";
        String result1 = new programmers.P120892().solution(cipher1, code1);
        PRINT_RESULT(1, result1, answer1);

        String cipher2 = "pfqallllabwaoclk";
        int code2 = 2;
        String answer2 = "fallback";
        String result2 = new programmers.P120892().solution(cipher2, code2);
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

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] ch = cipher.toCharArray();

        for (int i = code - 1; i < ch.length; i += code)
            answer.append(ch[i]);

        return answer.toString();
    }
}