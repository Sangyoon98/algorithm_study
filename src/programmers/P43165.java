package programmers;

class P43165 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 1, 1, 1, 1};
        int target1 = 3;
        int answer1 = 5;
        int result1 = new programmers.P43165().solution(numbers1, target1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{4, 1, 2, 1};
        int target2 = 4;
        int answer2 = 2;
        int result2 = new programmers.P43165().solution(numbers2, target2);
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

    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    static void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (target == sum) answer++;
        } else {
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }
    }
}