package insung.programers.level_2;

public class no_42584 {

    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                int currentPrice = prices[i];
                int count = 0;
                for(int j = i+1; j < prices.length; j++){
                    int nextPrice = prices[j];
                    count++;
                    if(nextPrice < currentPrice) break;

                }
                answer[i] = count;
            }

            for(int a : answer){
                System.out.print(a + " ");
            }
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        solution.solution(prices);
    }
}
