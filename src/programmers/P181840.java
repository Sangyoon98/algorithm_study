package programmers;

class P181840 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 2, 3, 4, 5};
        int n1 = 3;
        int answer1 = 1;
        int result1 = new programmers.P181840().solution(num_list1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{15, 98, 23, 2, 15};
        int n2 = 20;
        int answer2 = 0;
        int result2 = new programmers.P181840().solution(num_list2, n2);
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

    public int solution(int[] num_list, int n) {
        for (int i : num_list)
            if (i == n) return 1;
        return 0;
    }
}