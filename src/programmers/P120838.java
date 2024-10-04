package programmers;

import java.util.HashMap;
import java.util.Map;

class P120838 {
    public static void main(String[] args) {
        String letter1 = ".... . .-.. .-.. ---";
        String answer1 = "hello";
        String result1 = new programmers.P120838().solution(letter1);
        PRINT_RESULT(1, result1, answer1);

        String letter2 = ".--. -.-- - .... --- -.";
        String answer2 = "python";
        String result2 = new programmers.P120838().solution(letter2);
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

    public String solution(String letter) {
        Map<String, Character> morse = new HashMap<>() {{
            put(".-", 'a');
            put("-...", 'b');
            put("-.-.", 'c');
            put("-..", 'd');
            put(".", 'e');
            put("..-.", 'f');
            put("--.", 'g');
            put("....", 'h');
            put("..", 'i');
            put(".---", 'j');
            put("-.-", 'k');
            put(".-..", 'l');
            put("--", 'm');
            put("-.", 'n');
            put("---", 'o');
            put(".--.", 'p');
            put("--.-", 'q');
            put(".-.", 'r');
            put("...", 's');
            put("-", 't');
            put("..-", 'u');
            put("...-", 'v');
            put(".--", 'w');
            put("-..-", 'x');
            put("-.--", 'y');
            put("--..", 'z');
        }};

        StringBuilder answer = new StringBuilder();
        String[] arr = letter.split(" ");

        for (String s : arr) {
            answer.append(morse.get(s));
        }

        return answer.toString();
    }
}