package insung.programers.level_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class no_154539_1 {
    static class Solution {
        public int[] solution(int[] numbers) {
            int n = numbers.length;
            int[] answer = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && numbers[stack.peek()] <= numbers[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    answer[i] = -1;
                } else {
                    answer[i] = numbers[stack.peek()];
                }
                stack.push(i);
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
