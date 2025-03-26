package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P12981 {
    public static void main(String[] args) {
        int n1 = 3;
        String[] words1 = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer1 = new int[]{3, 3};
        int[] result1 = new programmers.P12981().solution(n1, words1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 5;
        String[] words2 = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] answer2 = new int[]{0, 0};
        int[] result2 = new programmers.P12981().solution(n2, words2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 2;
        String[] words3 = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer3 = new int[]{1, 3};
        int[] result3 = new programmers.P12981().solution(n3, words3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);
        answer[1]++;
        boolean isFault = false;

        for (int i = 1; i < words.length; i++) {
            answer[0] = i % n + 1;
            if (i % n == 0) answer[1]++;

            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                isFault = true;
                break;
            }

            if (arr.contains(words[i])) {
                isFault = true;
                break;
            }

            arr.add(words[i]);
        }

        if (!isFault) {
            answer[0] = 0;
            answer[1] = 0;
        }

        return answer;
    }
}