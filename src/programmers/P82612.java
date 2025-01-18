package programmers;

class P82612 {
    public static void main(String[] args) {
        int price1 = 3;
        int money1 = 20;
        int count1 = 4;
        long answer1 = 10L;
        long result1 = new programmers.P82612().solution(price1, money1, count1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, long result, long answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) sum += (long) price * i;
        if (sum < money) return 0;
        return sum - money;
    }
}