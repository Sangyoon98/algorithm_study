package programmers;

class P181932 {
    public static void main(String[] args) {
        String code1 = "abc1abc1abc";
        String answer1 = "acbac";
        String result1 = new programmers.P181932().solution(code1);
        PRINT_RESULT(1, result1, answer1);
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

    public String solution(String code) {
        String[] arr = code.split("");
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (mode) {
                case 0: {
                    if (arr[i].equals("1")) mode = 1;
                    else if (i % 2 == 0) answer.append(arr[i]);
                    break;
                }
                case 1: {
                    if (arr[i].equals("1")) mode = 0;
                    else if (i % 2 != 0) answer.append(arr[i]);
                    break;
                }
            }
        }

        return answer.toString().isEmpty() ? "EMPTY" : answer.toString();
    }
}