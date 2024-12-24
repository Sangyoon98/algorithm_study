package programmers;

import java.time.LocalDate;

class p181838 {
    public static void main(String[] args) {
        int[] date11 = new int[]{2021, 12, 28};
        int[] date21 = new int[]{2021, 12, 29};
        int answer1 = 1;
        int result1 = new programmers.p181838().solution(date11, date21);
        PRINT_RESULT(1, result1, answer1);

        int[] date12 = new int[]{1024, 10, 24};
        int[] date22 = new int[]{1024, 10, 24};
        int answer2 = 0;
        int result2 = new programmers.p181838().solution(date12, date22);
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

    public int solution(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        return (dateA.isBefore(dateB)) ? 1 : 0;
    }
}