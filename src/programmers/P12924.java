package programmers;

class P12924 {
    public static void main(String[] args) {
        int n1 = 15;
        int answer1 = 4;
        int result1 = new programmers.P12924().solution(n1);
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

    public int solution(int n) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (start <= n) {
            while (++end <= n) {
                sum += end;
                if (sum >= n) {
                    if (sum == n) count++;
                    break;
                }
            }
            while (++start <= n) {
                sum -= start;
                if (sum <= n) {
                    if (sum == n) count++;
                    break;
                }
            }
        }
        return count;
    }
}