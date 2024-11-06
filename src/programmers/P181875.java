package programmers;

import java.util.Arrays;

class P181875 {
    public static void main(String[] args) {
        String[] strArr1 = new String[]{"AAA", "BBB", "CCC", "DDD"};
        String[] answer1 = new String[]{"aaa", "BBB", "ccc", "DDD"};
        String[] result1 = new programmers.P181875().solution(strArr1);
        PRINT_RESULT(1, result1, answer1);

        String[] strArr2 = new String[]{"aBc", "AbC"};
        String[] answer2 = new String[]{"abc", "ABC"};
        String[] result2 = new programmers.P181875().solution(strArr2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, String[] result, String[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            char[] str = strArr[i].toCharArray();
            if (i % 2 == 0) {
                for (int j = 0; j < str.length; j++)
                    str[j] = Character.toLowerCase(str[j]);
            } else {
                for (int j = 0; j < str.length; j++)
                    str[j] = Character.toUpperCase(str[j]);
            }
            strArr[i] = new String(str);
        }
        return strArr;
    }
}