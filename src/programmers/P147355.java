package programmers;

class P147355 {
    public static void main(String[] args) {
        String t1 = "3141592";
        String p1 = "271";
        int answer1 = 2;
        int result1 = new programmers.P147355().solution(t1, p1);
        PRINT_RESULT(1, result1, answer1);

        String t2 = "500220839878";
        String p2 = "7";
        int answer2 = 8;
        int result2 = new programmers.P147355().solution(t2, p2);
        PRINT_RESULT(2, result2, answer2);

        String t3 = "10203";
        String p3 = "15";
        int answer3 = 3;
        int result3 = new programmers.P147355().solution(t3, p3);
        PRINT_RESULT(3, result3, answer3);
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

    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}