package programmers;

class P120846 {
    public static void main(String[] args) {
        int n1 = 10;
        int answer1 = 5;
        int result1 = new programmers.P120846().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 15;
        int answer2 = 8;
        int result2 = new programmers.P120846().solution(n2);
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
        int answer = 0;

        for (int i = 1; i <= n; i++)
            if (getNum(i) >= 3) answer++;

        return answer;
    }

    public int getNum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        return count;
    }
}