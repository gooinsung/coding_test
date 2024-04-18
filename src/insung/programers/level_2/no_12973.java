package insung.programers.level_2;

import java.util.Stack;

public class no_12973 {
    static class Solution {
        public int solution(String s) {

            char[] arr = s.toCharArray();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                if(stack.isEmpty()) stack.push(arr[i]);
                else{
                    if(stack.peek() == arr[i]) stack.pop();
                    else stack.push(arr[i]);
                }
            }
            return stack.isEmpty() ? 1: 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("cdcd"));

    }
}
