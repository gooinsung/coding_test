package insung.programers.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no_161989 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.solution(8,4,new int[]{2,3,6});
  }
  static class Solution {
    public int solution(int n, int m, int[] section) {
      int answer = 0;

      int start = section[0];
      int end = section[0] + (m-1);

      for(int i : section){
        if(i>=start && i<=end){
          continue;
        }else{
          start = i;
          end = i + (m-1);
          answer++;
        }
      }

      return answer;
    }
  }
}