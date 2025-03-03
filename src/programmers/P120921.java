package programmers;

class P120921 {
    public static void main(String[] args) {
        String A1 = "hello";
        String B1 = "ohell";
        int answer1 = 1;
        int result1 = new programmers.P120921().solution(A1, B1);
        PRINT_RESULT(1, result1, answer1);

        String A2 = "apple";
        String B2 = "elppa";
        int answer2 = -1;
        int result2 = new programmers.P120921().solution(A2, B2);
        PRINT_RESULT(2, result2, answer2);

        String A3 = "atat";
        String B3 = "tata";
        int answer3 = 1;
        int result3 = new programmers.P120921().solution(A3, B3);
        PRINT_RESULT(3, result3, answer3);

        String A4 = "abc";
        String B4 = "abc";
        int answer4 = 0;
        int result4 = new programmers.P120921().solution(A4, B4);
        PRINT_RESULT(4, result4, answer4);
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

    public int solution(String A, String B) {
        int answer = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return answer;
            else {
                A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
                answer++;
            }
        }

        if (answer == A.length()) return -1;

        return answer;
        //return B.repeat(2).indexOf(A);
    }
}