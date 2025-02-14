package programmers;

class P120922 {
    public static void main(String[] args) {
        int M1 = 2;
        int N1 = 2;
        int answer1 = 3;
        int result1 = new programmers.P120922().solution(M1, N1);
        PRINT_RESULT(1, result1, answer1);

        int M2 = 2;
        int N2 = 5;
        int answer2 = 9;
        int result2 = new programmers.P120922().solution(M2, N2);
        PRINT_RESULT(2, result2, answer2);

        int M3 = 1;
        int N3 = 1;
        int answer3 = 0;
        int result3 = new programmers.P120922().solution(M3, N3);
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

    public int solution(int M, int N) {
        return N * M - 1;
    }
}