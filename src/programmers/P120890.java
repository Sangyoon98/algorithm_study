package programmers;

class P120890 {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 10, 28};
        int n1 = 20;
        int answer1 = 28;
        int result1 = new programmers.P120890().solution(array1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{10, 11, 12};
        int n2 = 13;
        int answer2 = 12;
        int result2 = new programmers.P120890().solution(array2, n2);
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

    public int solution(int[] array, int n) {
        int minAbs = Math.abs(n - array[0]);
        int minVal = array[0];

        for (int i : array) {
            if (Math.abs(n - i) < minAbs) {
                minAbs = Math.abs(n - i);
                minVal = i;
            }
        }

        return minVal;
    }
}