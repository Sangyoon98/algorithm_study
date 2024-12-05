package programmers;

class P181898 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 0, 0, 1};
        int idx1 = 1;
        int answer1 = 3;
        int result1 = new programmers.P181898().solution(arr1, idx1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{1, 0, 0, 1, 0, 0};
        int idx2 = 4;
        int answer2 = -1;
        int result2 = new programmers.P181898().solution(arr2, idx2);
        PRINT_RESULT(2, result2, answer2);

        int[] arr3 = new int[]{1, 1, 1, 1, 0};
        int idx3 = 3;
        int answer3 = 3;
        int result3 = new programmers.P181898().solution(arr3, idx3);
        PRINT_RESULT(3, result3, answer3);
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

    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) return i;
        }

        return -1;
    }
}