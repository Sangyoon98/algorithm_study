package programmers;

class P120891 {
    public static void main(String[] args) {
        int order1 = 3;
        int answer1 = 1;
        int result1 = new programmers.P120891().solution(order1);
        PRINT_RESULT(1, result1, answer1);

        int order2 = 29423;
        int answer2 = 2;
        int result2 = new programmers.P120891().solution(order2);
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

    public int solution(int order) {
        int answer = 0;
        String[] arr = String.valueOf(order).split("");
        for (String i : arr)
            if (i.equals("3") || i.equals("6") || i.equals("9")) answer++;
        return answer;
    }
}