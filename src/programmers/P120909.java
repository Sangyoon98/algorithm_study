package programmers;

class P120909 {
    public static void main(String[] args) {
        int n1 = 144;
        int answer1 = 1;
        int result1 = new programmers.P120909().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 976;
        int answer2 = 2;
        int result2 = new programmers.P120909().solution(n2);
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
        if (Math.sqrt(n) % 1 == 0) return 1;
        else return 2;
    }
}