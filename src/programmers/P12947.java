package programmers;

class P12947 {
    public static void main(String[] args) {
        int x1 = 10;
        boolean answer1 = true;
        boolean result1 = new programmers.P12947().solution(x1);
        PRINT_RESULT(1, result1, answer1);

        int x2 = 12;
        boolean answer2 = true;
        boolean result2 = new programmers.P12947().solution(x2);
        PRINT_RESULT(2, result2, answer2);

        int x3 = 11;
        boolean answer3 = false;
        boolean result3 = new programmers.P12947().solution(x3);
        PRINT_RESULT(3, result3, answer3);

        int x4 = 13;
        boolean answer4 = false;
        boolean result4 = new programmers.P12947().solution(x4);
        PRINT_RESULT(4, result4, answer4);
    }

    public static void PRINT_RESULT(int index, boolean result, boolean answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for (String i : arr) sum += Integer.parseInt(i);
        if (x % sum != 0) answer = false;
        return answer;
    }
}