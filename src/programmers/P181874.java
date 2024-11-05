package programmers;

class P181874 {
    public static void main(String[] args) {
        String myString1 = "abstract algebra";
        String answer1 = "AbstrAct AlgebrA";
        String result1 = new programmers.P181874().solution(myString1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "PrOgRaMmErS";
        String answer2 = "progrAmmers";
        String result2 = new programmers.P181874().solution(myString2);
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

    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}