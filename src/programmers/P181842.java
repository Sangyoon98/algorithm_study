package programmers;

class P181842 {
    public static void main(String[] args) {
        String str11 = "abc";
        String str21 = "aabcc";
        int answer1 = 1;
        int result1 = new programmers.P181842().solution(str11, str21);
        PRINT_RESULT(1, result1, answer1);

        String str12 = "tbt";
        String str22 = "tbbttb";
        int answer2 = 0;
        int result2 = new programmers.P181842().solution(str12, str22);
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

    public int solution(String str1, String str2) {
        if (str2.contains(str1)) return 1;
        else return 0;
    }
}