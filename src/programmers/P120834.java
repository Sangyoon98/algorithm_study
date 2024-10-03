package programmers;

class P120834 {
    public static void main(String[] args) {
        int age1 = 23;
        String answer1 = "cd";
        String result1 = new programmers.P120834().solution(age1);
        PRINT_RESULT(1, result1, answer1);

        int age2 = 51;
        String answer2 = "fb";
        String result2 = new programmers.P120834().solution(age2);
        PRINT_RESULT(2, result2, answer2);

        int age3 = 100;
        String answer3 = "baa";
        String result3 = new programmers.P120834().solution(age3);
        PRINT_RESULT(3, result3, answer3);
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

    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String trans = "abcdefghij";
        String[] str = String.valueOf(age).split("");

        for (String s : str) {
            answer.append(trans.charAt(Integer.parseInt(s)));
        }

        return answer.toString();
    }
}