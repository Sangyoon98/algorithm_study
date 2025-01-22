package programmers;

import java.math.BigInteger;

class P181846 {
    public static void main(String[] args) {
        String a1 = "582";
        String b1 = "734";
        String answer1 = "1316";
        String result1 = new programmers.P181846().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        String a2 = "18446744073709551615";
        String b2 = "287346502836570928366";
        String answer2 = "305793246910280479981";
        String result2 = new programmers.P181846().solution(a2, b2);
        PRINT_RESULT(2, result2, answer2);

        String a3 = "0";
        String b3 = "0";
        String answer3 = "0";
        String result3 = new programmers.P181846().solution(a3, b3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        return String.valueOf(numA.add(numB));
    }
}