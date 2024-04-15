package insung.programers.level_2;

import java.util.Scanner;
import java.util.Stack;

public class no_12909 {
    static class Solution {
      public boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;

          Stack<Character> stack = new Stack<>();

          for(int i = 0; i<s.length(); i++){
              char c = s.charAt(i);
              if(c == '('){
                  stack.push(s.charAt(i));
              }
              if(c == ')'){
                  if(stack.size() == 0) return false;
                  else stack.pop();
              }
          }
          return stack.size() == 0;
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution solution = new Solution();

        System.out.println(solution.solution(str));
    }
}
