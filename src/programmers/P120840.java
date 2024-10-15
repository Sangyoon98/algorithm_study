package programmers;

import java.math.BigInteger;

class P120840 {
    public static void main(String[] args) {
        int balls1 = 3;
        int share1 = 2;
        int answer1 = 3;
        int result1 = new programmers.P120840().solution(balls1, share1);
        PRINT_RESULT(1, result1, answer1);

        int balls2 = 5;
        int share2 = 3;
        int answer2 = 10;
        int result2 = new programmers.P120840().solution(balls2, share2);
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

    public int solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }

    public BigInteger factorial(int i) {
        BigInteger sum = BigInteger.ONE;

        while (i != 0) {
            sum = sum.multiply(BigInteger.valueOf(i));
            i--;
        }

        return sum;
    }
}