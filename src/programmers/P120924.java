package programmers;

class P120924 {
    public static void main(String[] args) {
        int[] common1 = new int[]{1, 2, 3, 4};
        int answer1 = 5;
        int result1 = new programmers.P120924().solution(common1);
        PRINT_RESULT(1, result1, answer1);

        int[] common2 = new int[]{2, 4, 8};
        int answer2 = 16;
        int result2 = new programmers.P120924().solution(common2);
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

    public int solution(int[] common) {
        return (common[1] - common[0] == common[2] - common[1]) ? common[common.length - 1] + (common[1] - common[0]) : common[common.length - 1] * (common[1] / common[0]);
    }
}