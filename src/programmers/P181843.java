package programmers;

class P181843 {
    public static void main(String[] args) {
        String my_string1 = "banana";
        String target1 = "ana";
        int answer1 = 1;
        int result1 = new programmers.P181843().solution(my_string1, target1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "banana";
        String target2 = "wxyz";
        int answer2 = 0;
        int result2 = new programmers.P181843().solution(my_string2, target2);
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

    public int solution(String my_string, String target) {
        if (my_string.contains(target)) return 1;
        else return 0;
    }
}