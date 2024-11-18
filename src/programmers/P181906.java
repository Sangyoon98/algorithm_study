package programmers;

class P181906 {
    public static void main(String[] args) {
        String my_string1 = "banana";
        String is_prefix1 = "ban";
        int answer1 = 1;
        int result1 = new programmers.P181906().solution(my_string1, is_prefix1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "banana";
        String is_prefix2 = "nan";
        int answer2 = 0;
        int result2 = new programmers.P181906().solution(my_string2, is_prefix2);
        PRINT_RESULT(2, result2, answer2);

        String my_string3 = "banana";
        String is_prefix3 = "abcd";
        int answer3 = 0;
        int result3 = new programmers.P181906().solution(my_string3, is_prefix3);
        PRINT_RESULT(3, result3, answer3);

        String my_string4 = "banana";
        String is_prefix4 = "bananan";
        int answer4 = 0;
        int result4 = new programmers.P181906().solution(my_string4, is_prefix4);
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

    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        char[] pre = is_prefix.toCharArray();
        if (arr.length < pre.length) return answer;
        for (int i = 0; i < pre.length; i++) {
            if (arr[i] != pre[i]) {
                answer = 0;
                break;
            } else answer = 1;
        }
        return answer;
        //return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}