package programmers;

class P181903 {
    public static void main(String[] args) {
        int q1 = 3;
        int r1 = 1;
        String code1 = "qjnwezgrpirldywt";
        String answer1 = "jerry";
        String result1 = new programmers.P181903().solution(q1, r1, code1);
        PRINT_RESULT(1, result1, answer1);

        int q2 = 1;
        int r2 = 0;
        String code2 = "programmers";
        String answer2 = "programmers";
        String result2 = new programmers.P181903().solution(q2, r2, code2);
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

    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        String[] arr = code.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) answer.append(arr[i]);
        }
        return answer.toString();
    }
}