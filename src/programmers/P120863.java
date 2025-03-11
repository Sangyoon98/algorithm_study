package programmers;

class P120863 {
    public static void main(String[] args) {
        String polynomial1 = "3x + 7 + x";
        String answer1 = "4x + 7";
        String result1 = new programmers.P120863().solution(polynomial1);
        PRINT_RESULT(1, result1, answer1);

        String polynomial2 = "x + x + x";
        String answer2 = "3x";
        String result2 = new programmers.P120863().solution(polynomial2);
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

    public String solution(String polynomial) {
        String[] arr = polynomial.replace(" ", "").split("\\+");
        int a = 0, b = 0;

        for (String s : arr) {
            if (s.contains("x")) {
                String str = s.replace("x", "");
                a += Integer.parseInt(str.isEmpty() ? "1" : str);
                System.out.println(a);
            }
            else b += Integer.parseInt(s);
        }

        if (a == 1 && b != 0) return "x + " + b;
        else if (a == 1 && b == 0) return "x";
        else if (a != 0 && b != 0) return a + "x + " + b;
        else if (a == 0 && b != 0) return b + "";
        else if (a != 0 && b == 0) return a + "x";
        else return "0";
    }
}