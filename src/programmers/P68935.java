package programmers;

class P68935 {
    public static void main(String[] args) {
        int n1 = 45;
        int answer1 = 7;
        int result1 = new programmers.P68935().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 125;
        int answer2 = 229;
        int result2 = new programmers.P68935().solution(n2);
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
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int count = 0;

        while (n >= 3) {
            sb.append(n % 3);
            n /= 3;
        }
        sb.append(n);

        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * (int) Math.pow(3, count);
            count++;
        }

        return answer;
    }
}