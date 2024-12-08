package programmers;

class P181865 {
    public static void main(String[] args) {
        String binomial1 = "43 + 12";
        int answer1 = 55;
        int result1 = new programmers.P181865().solution(binomial1);
        PRINT_RESULT(1, result1, answer1);

        String binomial2 = "0 - 7777";
        int answer2 = -7777;
        int result2 = new programmers.P181865().solution(binomial2);
        PRINT_RESULT(2, result2, answer2);

        String binomial3 = "40000 * 40000";
        int answer3 = 1600000000;
        int result3 = new programmers.P181865().solution(binomial3);
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

    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String op = arr[1];
        int answer = 0;

        if (op.equals("+")) answer = a + b;
        else if (op.equals("-")) answer = a - b;
        else answer = a * b;

        return answer;
    }
}