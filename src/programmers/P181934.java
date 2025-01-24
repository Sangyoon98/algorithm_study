package programmers;

class P181934 {
    public static void main(String[] args) {
        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;
        int answer1 = 1;
        int result1 = new programmers.P181934().solution(ineq1, eq1, n1, m1);
        PRINT_RESULT(1, result1, answer1);

        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;
        int answer2 = 0;
        int result2 = new programmers.P181934().solution(ineq2, eq2, n2, m2);
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

    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<")) {
            if (eq.equals("=")) return n <= m ? 1 : 0;
            else return n < m ? 1 : 0;
        } else {
            if (eq.equals("=")) return n >= m ? 1 : 0;
            else return n > m ? 1 : 0;
        }
    }
}