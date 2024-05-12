package insung.test;

import java.util.Stack;

public class no_12909 {
    static class Solution {
        boolean solution(String s) {
            if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') return false;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(s.charAt(i));
                }
                if (c == ')') {
                    if (stack.size() == 0) return false;
                    else stack.pop();
                }
            }
            return stack.size() == 0;
        }


        public static void main(String[] args) {
            Solution solution = new Solution();
            String str = "()()";
            System.out.println(solution.solution(str));
        }
    }
}


