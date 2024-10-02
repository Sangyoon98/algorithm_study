package programmers;

class P120849 {
    public static void main(String[] args) {
        String my_string1 = "bus";
        String answer1 = "bs";
        String result1 = new programmers.P120849().solution(my_string1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "nice to meet you";
        String answer2 = "nc t mt y";
        String result2 = new programmers.P120849().solution(my_string2);
        PRINT_RESULT(2, result2, answer2);
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

    public String solution(String my_string) {
        return my_string
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }
}