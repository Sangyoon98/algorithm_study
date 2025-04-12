package programmers;

import java.util.Arrays;

class P42577 {
    public static void main(String[] args) {
        String[] phone_book1 = new String[]{"119", "97674223", "1195524421"};
        boolean answer1 = false;
        boolean result1 = new programmers.P42577().solution(phone_book1);
        PRINT_RESULT(1, result1, answer1);

        String[] phone_book2 = new String[]{"123", "456", "789"};
        boolean answer2 = true;
        boolean result2 = new programmers.P42577().solution(phone_book2);
        PRINT_RESULT(2, result2, answer2);

        String[] phone_book3 = new String[]{"12", "123", "1235", "567", "88"};
        boolean answer3 = false;
        boolean result3 = new programmers.P42577().solution(phone_book3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, boolean result, boolean answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}