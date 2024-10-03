package programmers;

class P120825 {
    public static void main(String[] args) {
        String my_string1 = "hello";
        int n1 = 3;
        String answer1 = "hhheeellllllooo";
        String result1 = new programmers.P120825().solution(my_string1, n1);
        PRINT_RESULT(1, result1, answer1);
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

    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            sb.append(String.valueOf(c[i]).repeat(n));
        }
        return sb.toString();
    }
}