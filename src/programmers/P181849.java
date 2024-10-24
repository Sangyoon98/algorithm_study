package programmers;

class P181849 {
    public static void main(String[] args) {
        String num_str1 = "123456789";
        int answer1 = 45;
        int result1 = new programmers.P181849().solution(num_str1);
        PRINT_RESULT(1, result1, answer1);

        String num_str2 = "1000000";
        int answer2 = 1;
        int result2 = new programmers.P181849().solution(num_str2);
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

    public int solution(String num_str) {
        int sum = 0;

        for (char c : num_str.toCharArray())
            sum += c - '0';

        return sum;
    }
}