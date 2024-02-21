package insung.programers.level_1;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class no_42889 {

  public static void main(String[] args) {
    Solution solution = new Solution();

    solution.solution(new int[]{2,1,2,6,2,4,3,3},5);
  }
  static class Solution {
    public int[] solution(int[] stages, int N) {
      int[] answer = {};
      Map<Integer,Double> map = new HashMap<>();

      for(int i = 1; i<=N; i++){
        int a = 0;
        double b = 0;
        for(int j = 0; j<stages.length; j++){
          if(i<=stages[j]){
            a++;
            if(i == stages[j]){
              b++;
            }
          }

        }
        map.put(i,b/a);
      }

      System.out.println(map);

      List<Integer> sortedKeys = new ArrayList<>(map.keySet());
      sortedKeys.sort((k1,k2)->{
        Double v1 = map.get(k1);
        Double v2 = map.get(k2);
        return v2.compareTo(v1);
      });
      answer = sortedKeys.stream().mapToInt(Integer::intValue).toArray();

      return answer;

    }
  }

}
