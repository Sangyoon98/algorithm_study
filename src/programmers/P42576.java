package programmers;

import java.util.HashMap;

class P42576 {
    public static void main(String[] args) {
        String[] participant1 = new String[]{"leo", "kiki", "eden"};
        String[] completion1 = new String[]{"eden", "kiki"};
        String answer1 = "leo";
        String result1 = new programmers.P42576().solution(participant1, completion1);
        PRINT_RESULT(1, result1, answer1);

        String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};
        String answer2 = "vinko";
        String result2 = new programmers.P42576().solution(participant2, completion2);
        PRINT_RESULT(2, result2, answer2);

        String[] participant3 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = new String[]{"stanko", "ana", "mislav"};
        String answer3 = "mislav";
        String result3 = new programmers.P42576().solution(participant3, completion3);
        PRINT_RESULT(3, result3, answer3);
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

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) map.put(s, map.getOrDefault(s, 0) + 1);

        for (String s : completion) map.put(s, map.get(s) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}