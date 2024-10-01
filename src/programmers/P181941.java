package programmers;

class P181941 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"a", "b", "c"};
        String answer1 = "abc";
        String result1 = new programmers.P181941().solution(arr1);
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

    public String solution(String[] arr) {
        String answer = "";
        for (String s : arr) answer += s;
        return answer;
        // return String.join("", arr);
    }
}