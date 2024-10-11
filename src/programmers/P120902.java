package programmers;

class P120902 {
    public static void main(String[] args) {
        String my_string1 = "3 + 4";
        int answer1 = 7;
        int result1 = new programmers.P120902().solution(my_string1);
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

    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("+")) answer += Integer.parseInt(arr[i + 1]);
            else answer -= Integer.parseInt(arr[i + 1]);
        }

        return answer;
    }
}