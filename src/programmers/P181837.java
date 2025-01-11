package programmers;

class P181837 {
    public static void main(String[] args) {
        String[] order1 = new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer1 = 19000;
        int result1 = new programmers.P181837().solution(order1);
        PRINT_RESULT(1, result1, answer1);

        String[] order2 = new String[]{"americanoice", "americano", "iceamericano"};
        int answer2 = 13500;
        int result2 = new programmers.P181837().solution(order2);
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

    public int solution(String[] order) {
        int answer = 0;

        for (String s : order) {
            if (s.contains("americano") || s.contains("anything")) answer += 4500;
            else answer += 5000;
        }

        return answer;
    }
}