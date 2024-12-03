package programmers;

class P181834 {
    public static void main(String[] args) {
        String myString1 = "abcdevwxyz";
        String answer1 = "lllllvwxyz";
        String result1 = new programmers.P181834().solution(myString1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "jjnnllkkmm";
        String answer2 = "llnnllllmm";
        String result2 = new programmers.P181834().solution(myString2);
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

    public String solution(String myString) {
        char[] arr = new char[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l') arr[i] = 'l';
            else arr[i] = myString.charAt(i);
        }

        return new String(arr);
    }
}