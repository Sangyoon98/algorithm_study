package programmers;

class P12951 {
    public static void main(String[] args) {
        String s1 = "3people unFollowed me";
        String answer1 = "3people Unfollowed Me";
        String result1 = new programmers.P12951().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "for the last week";
        String answer2 = "For The Last Week";
        String result2 = new programmers.P12951().solution(s2);
        PRINT_RESULT(2, result2, answer2);
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

    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                sb.append(arr[i].substring(1).toLowerCase());
            }

            if (i != arr.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}