package programmers;

class P12953 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 6, 8, 14};
        int answer1 = 168;
        int result1 = new programmers.P12953().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{1, 2, 3};
        int answer2 = 6;
        int result2 = new programmers.P12953().solution(arr2);
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

    public int solution(int[] arr) {
        if (arr.length == 1) return arr[0];

        int gcd = gcd(arr[0], arr[1]);
        int answer = (arr[0] * arr[1]) / gcd;

        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i++) {
                gcd = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / gcd;
            }
        }

        return answer;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}