package programmers;

class P120869 {
    public static void main(String[] args) {
        String[] spell1 = new String[]{"p", "o", "s"};
        String[] dic1 = new String[]{"sod", "eocd", "qixm", "adio", "soo"};
        int answer1 = 2;
        int result1 = new programmers.P120869().solution(spell1, dic1);
        PRINT_RESULT(1, result1, answer1);

        String[] spell2 = new String[]{"z", "d", "x"};
        String[] dic2 = new String[]{"def", "dww", "dzx", "loveaw"};
        int answer2 = 1;
        int result2 = new programmers.P120869().solution(spell2, dic2);
        PRINT_RESULT(2, result2, answer2);

        String[] spell3 = new String[]{"s", "o", "m", "d"};
        String[] dic3 = new String[]{"moos", "dzx", "smm", "sunmmo", "som"};
        int answer3 = 2;
        int result3 = new programmers.P120869().solution(spell3, dic3);
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

    public int solution(String[] spell, String[] dic) {
        for (String s : dic) {
            int answer = 0;
            for (String string : spell)
                if (s.contains(string)) answer++;
            if (answer == spell.length) return 1;
        }
        return 2;
    }
}