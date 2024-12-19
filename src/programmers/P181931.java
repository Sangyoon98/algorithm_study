package programmers;

class P181931 {
    public static void main(String[] args) {
        int a1 = 3;
        int d1 = 4;
        boolean[] included1 = new boolean[]{true, false, false, true, true};
        int answer1 = 37;
        int result1 = new programmers.P181931().solution(a1, d1, included1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 7;
        int d2 = 1;
        boolean[] included2 = new boolean[]{false, false, false, true, false, false, false};
        int answer2 = 10;
        int result2 = new programmers.P181931().solution(a2, d2, included2);
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

    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
        arr[0] = a;
        int answer = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
        }

        for (int i = 0; i < included.length; i++) {
            if (included[i]) answer += arr[i];
        }

        return answer;
    }
}