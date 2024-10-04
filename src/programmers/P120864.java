package programmers;

class P120864 {
    public static void main(String[] args) {
        String my_string1 = "aAb1B2cC34oOp";
        int answer1 = 37;
        int result1 = new programmers.P120864().solution(my_string1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "1a2b3c4d123Z";
        int answer2 = 133;
        int result2 = new programmers.P120864().solution(my_string2);
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

    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-z]|[A-Z]", " ").split(" ");
        for (String s : arr) {
            if (!s.isEmpty()) answer += Integer.parseInt(s);
        }
        return answer;
    }
}