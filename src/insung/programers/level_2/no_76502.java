package insung.programers.level_2;

import java.util.Stack;

public class no_76502 {
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            int n = s.length();
            String str;

            for (int i = 0; i < n; i++) {
                str = s.substring(i) + s.substring(0, i); // 문자열을 회전시킵니다.

                Stack<Character> stack = new Stack<>();
                boolean isValid = true; // 회전된 문자열이 유효한지 판단하는 플래그

                for (char c : str.toCharArray()) {
                    if (c == '(' || c == '{' || c == '[') {
                        stack.push(c); // 열린 괄호는 스택에 푸시
                    } else {
                        if (stack.isEmpty()) {
                            isValid = false; // 스택이 비어있다면 닫는 괄호에 매칭되는 열린 괄호가 없음
                            break;
                        }
                        char top = stack.pop(); // 스택에서 열린 괄호를 팝
                        if ((top == '(' && c != ')') ||
                                (top == '{' && c != '}') ||
                                (top == '[' && c != ']')) {
                            isValid = false; // 괄호의 짝이 맞지 않으면 유효하지 않음
                            break;
                        }
                    }
                }

                if (isValid && stack.isEmpty()) {
                    answer++; // 스택이 비어있고 유효하다면, 올바른 회전
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("[)(]"));
    }
}
