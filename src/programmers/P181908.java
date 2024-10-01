package programmers;

class P181908 {
    public static void main(String[] args) {
        String my_string1 = "banana";
        String is_suffix1 = "ana";
        int answer1 = 1;
        int result1 = new programmers.P181908().solution(my_string1, is_suffix1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "banana";
        String is_suffix2 = "nan";
        int answer2 = 0;
        int result2 = new programmers.P181908().solution(my_string2, is_suffix2);
        PRINT_RESULT(2, result2, answer2);

        String my_string3 = "banana";
        String is_suffix3 = "wxyz";
        int answer3 = 0;
        int result3 = new programmers.P181908().solution(my_string3, is_suffix3);
        PRINT_RESULT(3, result3, answer3);

        String my_string4 = "banana";
        String is_suffix4 = "abanana";
        int answer4 = 0;
        int result4 = new programmers.P181908().solution(my_string4, is_suffix4);
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

    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (is_suffix.equals(my_string.substring(i)))
                answer = 1;
        }
        return answer;

        // if (my_string.endsWith(is_suffix)) return 1;
        // else return 0;
    }
}