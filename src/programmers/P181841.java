package programmers;

class P181841 {
    public static void main(String[] args) {
        String[] str_list1 = new String[]{"abc", "def", "ghi"};
        String ex1 = "ef";
        String answer1 = "abcghi";
        String result1 = new programmers.P181841().solution(str_list1, ex1);
        PRINT_RESULT(1, result1, answer1);

        String[] str_list2 = new String[]{"abc", "bbc", "cbc"};
        String ex2 = "c";
        String answer2 = "";
        String result2 = new programmers.P181841().solution(str_list2, ex2);
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

    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String s : str_list)
            if (!s.contains(ex)) answer.append(s);
        return answer.toString();
    }
}