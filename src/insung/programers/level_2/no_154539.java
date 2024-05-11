package insung.programers.level_2;

public class no_154539 {
    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                int current = numbers[i];
                int result = -1;
                for (int j = i; j < numbers.length; j++) {
                    int next = numbers[j];
                    if(next > current){
                        result = next;
                        break;
                    }
                }
                answer[i] = result;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {9, 1, 5, 3, 6, 2};

        solution.solution(arr);
    }
}
