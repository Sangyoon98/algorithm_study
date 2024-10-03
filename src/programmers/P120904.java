package programmers;

class P120904 {
    public static void main(String[] args) {
        int num1 = 29183;
        int k1 = 1;
        int answer1 = 3;
        int result1 = new programmers.P120904().solution(num1, k1);
        PRINT_RESULT(1, result1, answer1);

        int num2 = 232443;
        int k2 = 4;
        int answer2 = 4;
        int result2 = new programmers.P120904().solution(num2, k2);
        PRINT_RESULT(2, result2, answer2);

        int num3 = 123456;
        int k3 = 7;
        int answer3 = -1;
        int result3 = new programmers.P120904().solution(num3, k3);
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

    public int solution(int num, int k) {
        int answer = 0;
        String[] arr = String.valueOf(num).split("");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == k) {
                answer = i + 1;
                break;
            } else answer = -1;
        }

        return answer;
    }
}