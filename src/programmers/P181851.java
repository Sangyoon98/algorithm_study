package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class P181851 {
    public static void main(String[] args) {
        int[] rank1 = new int[]{3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance1 = new boolean[]{false, true, true, true, true, false, false};
        int answer1 = 20403;
        int result1 = new programmers.P181851().solution(rank1, attendance1);
        PRINT_RESULT(1, result1, answer1);

        int[] rank2 = new int[]{1, 2, 3};
        boolean[] attendance2 = new boolean[]{true, true, true};
        int answer2 = 102;
        int result2 = new programmers.P181851().solution(rank2, attendance2);
        PRINT_RESULT(2, result2, answer2);

        int[] rank3 = new int[]{6, 1, 5, 2, 3, 4};
        boolean[] attendance3 = new boolean[]{true, false, true, false, false, true};
        int answer3 = 50200;
        int result3 = new programmers.P181851().solution(rank3, attendance3);
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

    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }

        ArrayList<Integer> ranking = new ArrayList<>(map.keySet());

        Collections.sort(ranking);
        int a = map.get(ranking.get(0));
        int b = map.get(ranking.get(1));
        int c = map.get(ranking.get(2));

        return 10000 * a + 100 * b + c;
    }
}