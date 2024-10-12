package programmers;

class P181887 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{4, 2, 6, 1, 7, 6};
        int answer1 = 17;
        int result1 = new programmers.P181887().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{-1, 2, 5, 6, 3};
        int answer2 = 8;
        int result2 = new programmers.P181887().solution(num_list2);
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

    public int solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int i = 1; i <= num_list.length; i++) {
            if (i % 2 == 0) even += num_list[i - 1];
            else odd += num_list[i - 1];
        }
        return Math.max(even, odd);
    }
}