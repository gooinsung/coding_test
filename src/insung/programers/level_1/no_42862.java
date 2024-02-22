package insung.programers.level_1;

import java.util.HashMap;
import java.util.Map;

public class no_42862 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.solution(5,new int[]{2,4,}, new int[]{1,3,5});
  }

  static class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
      int answer = 0;
      Map<Integer,Boolean> reserveMap = new HashMap<>();

      for(int i = 1; i <= n; i++){
        for(int j = 0; j < reserve.length; j++){
          if(i == reserve[j]){
            reserveMap.put(i,true);
            break;
          }else{
            reserveMap.put(i,false);
          }
        }
      }

      for(int i = 1; i <= n; i++){
        for(int j = 0; j < lost.length; j++){
          if(i == lost[j]){
            if(reserveMap.get(String.valueOf(lost[j]-1)) != null){
              if(reserveMap.get(String.valueOf(lost[j]-1))){
                answer++;
                reserveMap.remove(String.valueOf(lost[j-1]));
                reserveMap.put(j-1,false);
                break;
              }
            }
            if(reserveMap.get(String.valueOf(lost[j]+1)) != null){
              if(reserveMap.get(String.valueOf(lost[j]+1))){
                answer++;
                reserveMap.remove(String.valueOf(lost[j+1]));
                reserveMap.put(j+1,false);
                break;
              }
            }
          }else{
            answer++;
            break;
          }
        }
      }


      return answer;
    }
  }
}
