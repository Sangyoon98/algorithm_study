package programmers;

class P120894 {
    public static void main(String[] args) {
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        long answer1 = 123456789L;
        long result1 = new programmers.P120894().solution(numbers1);
        PRINT_RESULT(1, result1, answer1);

        String numbers2 = "onefourzerosixseven";
        long answer2 = 14067L;
        long result2 = new programmers.P120894().solution(numbers2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, long result, long answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replace("one", "1")
                        .replace("two", "2")
                        .replace("three", "3")
                        .replace("four", "4")
                        .replace("five", "5")
                        .replace("six", "6")
                        .replace("seven", "7")
                        .replace("eight", "8")
                        .replace("nine", "9")
                        .replace("zero", "0")
        );
    }
}