package programmers;

class P181914 {
    public static void main(String[] args) {
        String number1 = "123";
        int answer1 = 6;
        int result1 = new programmers.P181914().solution(number1);
        PRINT_RESULT(1, result1, answer1);

        String number2 = "78720646226947352489";
        int answer2 = 2;
        int result2 = new programmers.P181914().solution(number2);
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

    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        for (String s : arr) answer += Integer.parseInt(s);
        return answer % 9;
    }
}