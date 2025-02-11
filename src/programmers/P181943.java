package programmers;

class P181943 {
    public static void main(String[] args) {
        String my_string1 = "He11oWor1d";
        String overwrite_string1 = "lloWorl";
        int s1 = 2;
        String answer1 = "HelloWorld";
        String result1 = new programmers.P181943().solution(my_string1, overwrite_string1, s1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "Program29b8UYP";
        String overwrite_string2 = "merS123";
        int s2 = 7;
        String answer2 = "ProgrammerS123";
        String result2 = new programmers.P181943().solution(my_string2, overwrite_string2, s2);
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

    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}