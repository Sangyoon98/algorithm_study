package programmers;

class P181872 {
    public static void main(String[] args) {
        String myString1 = "AbCdEFG";
        String pat1 = "dE";
        String answer1 = "AbCdE";
        String result1 = new programmers.P181872().solution(myString1, pat1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "AAAAaaaa";
        String pat2 = "a";
        String answer2 = "AAAAaaaa";
        String result2 = new programmers.P181872().solution(myString2, pat2);
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

    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = myString.length(); i >= 0; i--) {
            if (myString.substring(0, i).endsWith(pat)) {
                answer = myString.substring(0, i);
                break;
            }
        }

        return answer;
        /*String answer = "";
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx) + pat;
        return answer;*/
    }
}