package programmers;

class P120908 {
    public static void main(String[] args) {
        String str11 = "ab6CDE443fgh22iJKlmn1o";
        String str21 = "6CD";
        int answer1 = 1;
        int result1 = new programmers.P120908().solution(str11, str21);
        PRINT_RESULT(1, result1, answer1);

        String str12 = "ppprrrogrammers";
        String str22 = "pppp";
        int answer2 = 2;
        int result2 = new programmers.P120908().solution(str12, str22);
        PRINT_RESULT(2, result2, answer2);

        String str13 = "AbcAbcA";
        String str23 = "AAA";
        int answer3 = 2;
        int result3 = new programmers.P120908().solution(str13, str23);
        PRINT_RESULT(3, result3, answer3);
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
        return str1.contains(str2) ? 1 : 2;
    }
}