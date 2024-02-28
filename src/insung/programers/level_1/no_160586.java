package insung.programers.level_1;

import java.util.HashMap;
import java.util.Map;

public class no_160586 {

  public static void main(String[] args) {
    Solution solution = new Solution();
  }
  static class Solution {

    public int[] solution(String[] keymap, String[] targets) {
      int[] answer = new int[targets.length];
      Map<Character,Integer> keypad = new HashMap<>();

      for(int i = 0 ; i < keymap.length ; i ++){
        for(int j = 0 ; j < keymap[i].length(); j ++){
          Character c = keymap[i].charAt(j);
          if(keypad.containsKey(c)){
            int idx = keypad.get(c);
            keypad.put(c,Math.min(idx, j+1));
          }else{
            keypad.put(c, j+1);
          }
        }
      }

      for(int i = 0 ; i < targets.length ; i++){
        String target = targets[i];
        boolean contain = false;
        int count = 0;
        for(char c : target.toCharArray()){
          if(keypad.containsKey(c)){
            contain = true;
            count+=keypad.get(c);
          }
        }
        answer[i] = contain ? count : -1;
      }
      return answer;
    }
/*    public int[] solution(String[] keymap, String[] targets) {
      int[] answer = new int[targets.length];

      for(int i = 0 ; i < targets.length ; i ++){

        String target = targets[i];

        boolean contain = false;
        int count = 0;

        for(int j = 0 ; j < target.length(); j ++){
          int min = Integer.MAX_VALUE;
          String s = Character.toString(target.charAt(j));

          for(int k = 0 ; k < keymap.length ; k ++){
            if(keymap[k].contains(s)){
              contain = true;
              min = Integer.min(min,keymap[k].indexOf(s)+1);
            }
          }
          count+=min;

        }
        if(contain)
          answer[i] = count;
        else
          answer[i] = -1;
      }
      return answer;
    }*/
  }

}
