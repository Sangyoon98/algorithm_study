package programmers;

import java.util.HashMap;

class P42578 {
    public static void main(String[] args) {
        String[][] clothes1 = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer1 = 5;
        int result1 = new programmers.P42578().solution(clothes1);
        PRINT_RESULT(1, result1, answer1);

        String[][] clothes2 = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer2 = 3;
        int result2 = new programmers.P42578().solution(clothes2);
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

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        for (int i : map.values()) answer *= i + 1;
        return answer - 1;
    }
}