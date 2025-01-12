package programmers;

import java.util.Arrays;

class P181881 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 100, 99, 98};
        int answer1 = 5;
        int result1 = new programmers.P181881().solution(arr1);
        PRINT_RESULT(1, result1, answer1);
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

    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] temp = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) temp[i] = arr[i] / 2;
                else if (arr[i] < 50 && arr[i] % 2 != 0) temp[i] = arr[i] * 2 + 1;
            }

            if (Arrays.equals(arr, temp)) break;

            arr = Arrays.copyOf(temp, temp.length);
            answer++;
        }

        return answer;
    }
}