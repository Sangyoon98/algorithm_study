package programmers;

class P120853 {
    public static void main(String[] args) {
        String s1 = "1 2 Z 3";
        int answer1 = 4;
        int result1 = new programmers.P120853().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "10 20 30 40";
        int answer2 = 100;
        int result2 = new programmers.P120853().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = "10 Z 20 Z 1";
        int answer3 = 1;
        int result3 = new programmers.P120853().solution(s3);
        PRINT_RESULT(3, result3, answer3);

        String s4 = "10 Z 20 Z";
        int answer4 = 0;
        int result4 = new programmers.P120853().solution(s4);
        PRINT_RESULT(4, result4, answer4);

        String s5 = "-1 -2 -3 Z";
        int answer5 = -3;
        int result5 = new programmers.P120853().solution(s5);
        PRINT_RESULT(5, result5, answer5);
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

    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) answer -= Integer.parseInt(arr[i - 1]);
            else answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}