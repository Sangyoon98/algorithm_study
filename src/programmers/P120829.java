package programmers;

class P120829 {
    public static void main(String[] args) {
        int angle1 = 70;
        int answer1 = 1;
        int result1 = new programmers.P120829().solution(angle1);
        PRINT_RESULT(1, result1, answer1);

        int angle2 = 91;
        int answer2 = 3;
        int result2 = new programmers.P120829().solution(angle2);
        PRINT_RESULT(2, result2, answer2);

        int angle3 = 180;
        int answer3 = 4;
        int result3 = new programmers.P120829().solution(angle3);
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

    public int solution(int angle) {
        if (angle > 0 && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle > 90 && angle < 180) return 3;
        else return 4;
    }
}