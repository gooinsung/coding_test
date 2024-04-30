package insung.programers.level_2;

public class no_87390 {
    static class Solution {
        public int[] solution(int n, long left, long right) {
            // 결과를 저장할 배열
            int[] answer = new int[(int) (right - left + 1)];

            // left부터 right까지 각 요소를 계산하여 결과 배열에 저장
            for (long i = left; i <= right; i++) {
                int row = (int) (i / n);
                int col = (int) (i % n);
                answer[(int) (i - left)] = Math.max(row, col) + 1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for(int a : solution.solution(3, 2, 5)){
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
