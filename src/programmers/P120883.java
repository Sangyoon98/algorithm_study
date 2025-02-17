package programmers;

class P120883 {
    public static void main(String[] args) {
        String[] id_pw1 = new String[]{"meosseugi", "1234"};
        String[][] db1 = new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String answer1 = "login";
        String result1 = new programmers.P120883().solution(id_pw1, db1);
        PRINT_RESULT(1, result1, answer1);

        String[] id_pw2 = new String[]{"programmer01", "15789"};
        String[][] db2 = new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String answer2 = "wrong pw";
        String result2 = new programmers.P120883().solution(id_pw2, db2);
        PRINT_RESULT(2, result2, answer2);

        String[] id_pw3 = new String[]{"rabbit04", "98761"};
        String[][] db3 = new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        String answer3 = "fail";
        String result3 = new programmers.P120883().solution(id_pw3, db3);
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

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0]) && id_pw[1].equals(strings[1])) {
                answer = "login";
                break;
            } else if (id_pw[0].equals(strings[0])) {
                answer = "wrong pw";
                break;
            } else answer = "fail";
        }

        return answer;
    }
}