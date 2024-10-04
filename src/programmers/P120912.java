package programmers;

class P120912 {
    public static void main(String[] args) {
        int[] array1 = new int[]{7, 77, 17};
        int answer1 = 4;
        int result1 = new programmers.P120912().solution(array1);
        PRINT_RESULT(1, result1, answer1);

        int[] array2 = new int[]{10, 29};
        int answer2 = 0;
        int result2 = new programmers.P120912().solution(array2);
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

    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            char[] ch = String.valueOf(i).toCharArray();
            for (char c : ch) {
                if(c == '7') answer++;
            }
        }
        return answer;
    }
}