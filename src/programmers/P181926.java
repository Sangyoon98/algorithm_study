package programmers;

class P181926 {
    public static void main(String[] args) {
        int n1 = 0;
        String control1 = "wsdawsdassw";
        int answer1 = -1;
        int result1 = new programmers.P181926().solution(n1, control1);
        PRINT_RESULT(1, result1, answer1);
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

    public int solution(int n, String control) {
        int answer = n;

        for (char i : control.toCharArray()) {
            if (i == 'w') answer += 1;
            else if (i == 's') answer -= 1;
            else if (i == 'd') answer += 10;
            else answer -= 10;
        }

        return answer;
    }
}