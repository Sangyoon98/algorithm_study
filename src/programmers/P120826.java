package programmers;

class P120826 {
    public static void main(String[] args) {
        String my_string1 = "abcdef";
        String letter1 = "f";
        String answer1 = "abcde";
        String result1 = new programmers.P120826().solution(my_string1, letter1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "BCBdbe";
        String letter2 = "B";
        String answer2 = "Cdbe";
        String result2 = new programmers.P120826().solution(my_string2, letter2);
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

    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}