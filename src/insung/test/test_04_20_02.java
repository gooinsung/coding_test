package insung.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test_04_20_02 {
    static class Solution {
      public int[] solution(int[] arr) {
          Stack<Integer> stack = new Stack();

          for(int i : arr){
              if(stack.isEmpty()) stack.push(i);
              else{
                  if(stack.peek() == i) stack.pop();
                  stack.push(i);
              }
          }
          int[] answer = new int[stack.size()];
          for(int i = 0; i <stack.size(); i++)answer[i] = stack.get(i);


        return answer;
      }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        for(int i : solution.solution(new int[] {1,1,3,3,0,1,1})){
            System.out.println(i);
        }

    }
}
