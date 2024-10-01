package programmers;

class P181915 {
    public static void main(String[] args) {
        String my_string1 = "cvsgiorszzzmrpaqpe";
        int[] index_list1 = new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String answer1 = "programmers";
        String result1 = new programmers.P181915().solution(my_string1, index_list1);
        PRINT_RESULT(1, result1, answer1);

        String my_string2 = "zpiaz";
        int[] index_list2 = new int[]{1, 2, 0, 0, 3};
        String answer2 = "pizza";
        String result2 = new programmers.P181915().solution(my_string2, index_list2);
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

    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++)
            answer.append(my_string.toCharArray()[index_list[i]]);
        return answer.toString();

        /*StringBuilder answer = new StringBuilder();
        for (int i : index_list)
            answer.append(my_string.charAt(i));
        return answer.toString();*/
    }
}