package programmers;

class P120884 {
    public static void main(String[] args) {
        int chicken1 = 100;
        int answer1 = 11;
        int result1 = new programmers.P120884().solution(chicken1);
        PRINT_RESULT(1, result1, answer1);

        int chicken2 = 1081;
        int answer2 = 120;
        int result2 = new programmers.P120884().solution(chicken2);
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

    public int solution(int chicken) {
        int answer = 0;

        while(chicken >= 10) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }

        return answer;
    }
}