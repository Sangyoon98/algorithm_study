package programmers;

class P181930 {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 6;
        int c1 = 1;
        int answer1 = 9;
        int result1 = new programmers.P181930().solution(a1, b1, c1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 5;
        int b2 = 3;
        int c2 = 3;
        int answer2 = 473;
        int result2 = new programmers.P181930().solution(a2, b2, c2);
        PRINT_RESULT(2, result2, answer2);

        int a3 = 4;
        int b3 = 4;
        int c3 = 4;
        int answer3 = 110592;
        int result3 = new programmers.P181930().solution(a3, b3, c3);
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

    public int solution(int a, int b, int c) {
        if (a != b && a != c && b != c) return a + b + c;
        else if (a == b && a == c) return (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        else return (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }
}