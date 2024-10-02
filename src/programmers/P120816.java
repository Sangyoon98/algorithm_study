package programmers;

class P120816 {
    public static void main(String[] args) {
        int slice1 = 7;
        int n1 = 10;
        int answer1 = 2;
        int result1 = new programmers.P120816().solution(slice1, n1);
        PRINT_RESULT(1, result1, answer1);

        int slice2 = 4;
        int n2 = 12;
        int answer2 = 3;
        int result2 = new programmers.P120816().solution(slice2, n2);
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

    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}