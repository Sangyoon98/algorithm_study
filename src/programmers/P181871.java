package programmers;

class P181871 {
    public static void main(String[] args) {
        String myString1 = "banana";
        String pat1 = "ana";
        int answer1 = 2;
        int result1 = new programmers.P181871().solution(myString1, pat1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "aaaa";
        String pat2 = "aa";
        int answer2 = 3;
        int result2 = new programmers.P181871().solution(myString2, pat2);
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

    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            if (myString.charAt(i) == pat.charAt(0)) {
                int temp = 0;
                for (int j = 0; j < pat.length(); j++) {
                    if (myString.charAt(i + j) == pat.charAt(j)) temp++;
                }

                if (temp == pat.length()) answer++;
            }
        }
        return answer;

        /*int answer = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        return answer;*/
    }
}