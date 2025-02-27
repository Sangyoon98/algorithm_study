package programmers;

class P12911 {
    public static void main(String[] args) {
        int n1 = 78;
        int answer1 = 83;
        int result1 = new programmers.P12911().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 15;
        int answer2 = 23;
        int result2 = new programmers.P12911().solution(n2);
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

    public int solution(int n) {
        int answer = n + 1;
        int count = 0;

        String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }

        while (true) {
            int cnt = 0;
            String str = Integer.toBinaryString(answer);

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') cnt++;
            }

            if (count == cnt) break;

            answer++;
        }

        return answer;

        /*
        int answer = n + 1;
        int count = Integer.bitCount(n);

        while (count != Integer.bitCount(answer)) answer++;

        return answer;
        */
    }
}