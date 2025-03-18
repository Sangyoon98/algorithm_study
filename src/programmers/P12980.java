package programmers;

public class P12980 {
    public static void main(String[] args) {
        int n1 = 5;
        int answer1 = 2;
        int result1 = new programmers.P12980().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 6;
        int answer2 = 2;
        int result2 = new programmers.P12980().solution(n2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 5000;
        int answer3 = 5;
        int result3 = new programmers.P12980().solution(n3);
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

    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) n /= 2;
            else {
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
}
