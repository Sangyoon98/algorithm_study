package programmers;

public class P12943 {
    public static void main(String[] args) {
        int a1 = 6;
        int answer1 = 8;
        int result1 = new programmers.P12943().solution(a1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 16;
        int answer2 = 4;
        int result2 = new programmers.P12943().solution(a2);
        PRINT_RESULT(2, result2, answer2);


        int a3 = 626331;
        int answer3 = -1;
        int result3 = new programmers.P12943().solution(a3);
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

    public int solution(int num) {
        int count = 0;
        long temp = num;

        if (temp == 1) return 0;

        while (temp != 1) {
            if (temp % 2 == 0) temp = temp / 2;
            else temp = temp * 3 + 1;
            count++;
        }

        if (count > 500) return -1;
        return count;
    }
}
