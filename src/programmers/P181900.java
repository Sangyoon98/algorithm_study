package programmers;

class P181900 {
    public static void main(String[] args) {
        String my_string1 = "apporoograpemmemprs";
        int[] indices1 = new int[]{1, 16, 6, 15, 0, 10, 11, 3};
        String answer1 = "programmers";
        String result1 = new programmers.P181900().solution(my_string1, indices1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for (int i : indices) arr[i] = "";
        return String.join("", arr);
    }
}