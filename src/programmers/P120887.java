package programmers;

class P120887 {
    public static void main(String[] args) {
        int i1 = 1;
        int j1 = 13;
        int k1 = 1;
        int answer1 = 6;
        int result1 = new programmers.P120887().solution(i1, j1, k1);
        PRINT_RESULT(1, result1, answer1);

        int i2 = 10;
        int j2 = 50;
        int k2 = 5;
        int answer2 = 5;
        int result2 = new programmers.P120887().solution(i2, j2, k2);
        PRINT_RESULT(2, result2, answer2);

        int i3 = 3;
        int j3 = 10;
        int k3 = 2;
        int answer3 = 0;
        int result3 = new programmers.P120887().solution(i3, j3, k3);
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

    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a <= j; a++) {
            char[] ch = String.valueOf(a).toCharArray();
            for (char c : ch) {
                if (c == k + '0') answer++;
            }
        }
        return answer;
    }
}