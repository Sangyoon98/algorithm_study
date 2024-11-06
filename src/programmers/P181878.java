package programmers;

class P181878 {
    public static void main(String[] args) {
        String myString1 = "AbCdEfG";
        String pat1 = "aBc";
        int answer1 = 1;
        int result1 = new programmers.P181878().solution(myString1, pat1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "aaAA";
        String pat2 = "aaaaa";
        int answer2 = 0;
        int result2 = new programmers.P181878().solution(myString2, pat2);
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

    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}