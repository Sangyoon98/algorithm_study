package programmers;

class P181855 {
    public static void main(String[] args) {
        String[] strArr1 = new String[]{"a", "bc", "d", "efg", "hi"};
        int answer1 = 2;
        int result1 = new programmers.P181855().solution(strArr1);
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

    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];

        for (String s : strArr) {
            arr[s.length()]++;
        }

        for (int i : arr) {
            answer = Math.max(answer, i);
        }

        return answer;
    }
}