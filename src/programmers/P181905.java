package programmers;

class P181905 {
    public static void main(String[] args) {
        String my_string1 = "Progra21Sremm3";
        int s1 = 6;
        int e1 = 12;
        String answer1 = "ProgrammerS123";
        String result1 = new programmers.P181905().solution(my_string1, s1, e1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "Stanley1yelnatS";
        int s2 = 4;
        int e2 = 10;
        String answer2 = "Stanley1yelnatS";
        String result2 = new programmers.P181905().solution(my_string2, s2, e2);
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

    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        answer += my_string.substring(0, s);
        answer += sb.append(my_string, s, e + 1).reverse().toString();
        answer += my_string.substring(e + 1);
        return answer;
    }
}