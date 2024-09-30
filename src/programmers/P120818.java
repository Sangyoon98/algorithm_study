package programmers;

class P120818 {
    public static void main(String[] args) {
        int price1 = 150000;
        int answer1 = 142500;
        int result1 = new programmers.P120818().solution(price1);
        PRINT_RESULT(1, result1, answer1);

        int price2 = 580000;
        int answer2 = 464000;
        int result2 = new programmers.P120818().solution(price2);
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

    public int solution(int price) {
        if (price < 100000) return price;
        else if (price >= 100000 && price < 300000) return (int) (price - (price * 0.05));
        else if (price >= 300000 && price < 500000) return (int) (price - (price * 0.1));
        else return (int) (price - (price * 0.2));
    }
}