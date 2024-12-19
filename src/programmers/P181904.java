package programmers;

class P181904 {
    public static void main(String[] args) {
        String my_string1 = "ihrhbakrfpndopljhygc";
        int m1 = 4;
        int c1 = 2;
        String answer1 = "happy";
        String result1 = new programmers.P181904().solution(my_string1, m1, c1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "programmers";
        int m2 = 1;
        int c2 = 1;
        String answer2 = "programmers";
        String result2 = new programmers.P181904().solution(my_string2, m2, c2);
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

    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");

        for (int i = c - 1; i < arr.length; i += m) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}