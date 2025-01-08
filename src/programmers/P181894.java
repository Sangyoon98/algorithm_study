package programmers;

import java.util.Arrays;

class P181894 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 1, 4, 5, 2, 9};
        int[] answer1 = new int[]{2, 1, 4, 5, 2};
        int[] result1 = new programmers.P181894().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{1, 2, 1};
        int[] answer2 = new int[]{2};
        int[] result2 = new programmers.P181894().solution(arr2);
        PRINT_RESULT(2, result2, answer2);

        int[] arr3 = new int[]{1, 1, 1};
        int[] answer3 = new int[]{-1};
        int[] result3 = new programmers.P181894().solution(arr3);
        PRINT_RESULT(3, result3, answer3);

        int[] arr4 = new int[]{1, 2, 1, 2, 1, 10, 2, 1};
        int[] answer4 = new int[]{2, 1, 2, 1, 10, 2};
        int[] result4 = new programmers.P181894().solution(arr4);
        PRINT_RESULT(4, result4, answer4);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(int[] arr) {
        int first = 0;
        int last = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                first = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) last = i;
        }

        if (first == 0 && last == 0) return new int[] {-1};

        int[] answer = new int[last - first + 1];
        int j = 0;

        for (int i = first; i <= last; i++) {
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }
}