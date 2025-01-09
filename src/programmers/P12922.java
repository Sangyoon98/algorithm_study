package programmers;

class P12922 {
    public static void main(String[] args) {
        int n1 = 3;
        String answer1 = "수박수";
        String result1 = new programmers.P12922().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 4;
        String answer2 = "수박수박";
        String result2 = new programmers.P12922().solution(n2);
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

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append("수");
            else sb.append("박");
        }

        return sb.toString();
    }
}