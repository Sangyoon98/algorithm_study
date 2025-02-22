package programmers;

class P12930 {
    public static void main(String[] args) {
        String s1 = "try hello world";
        String answer1 = "TrY HeLlO WoRlD";
        String result1 = new programmers.P12930().solution(s1);
        PRINT_RESULT(1, result1, answer1);
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

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                count = 0;
            } else {
                if (count % 2 == 0) answer.append(Character.toUpperCase(s.charAt(i)));
                else answer.append(Character.toLowerCase(s.charAt(i)));
                count++;
            }
        }

        return answer.toString();
    }
}