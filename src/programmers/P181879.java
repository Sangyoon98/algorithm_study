package programmers;

class P181879 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int answer1 = 51;
        int result1 = new P181879().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{2, 3, 4, 5};
        int answer2 = 120;
        int result2 = new P181879().solution(num_list2);
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
        int answer = (num_list.length <= 10 ? 1 : 0);
        if (num_list.length <= 10) {
            for (int i : num_list) answer *= i;
        } else {
            for (int i : num_list) answer += i;
        }
        return answer;
    }
}