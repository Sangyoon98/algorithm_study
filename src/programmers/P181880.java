package programmers;

class P181880 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{12, 4, 15, 1, 14};
        int answer1 = 11;
        int result1 = new programmers.P181880().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);
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
        int answer = 0;
        for (int i : num_list) {
            int count = 0;
            while (i > 1) {
                if (i % 2 == 0) i /= 2;
                else i = (i - 1) / 2;
                count++;
            }
            answer += count;
        }
        return answer;
    }
}