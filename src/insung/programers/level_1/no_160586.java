package insung.programers.level_1;

public class no_160586 {

  public static void main(String[] args) {
    Solution solution = new Solution();

  }
  static class Solution {
    public int[] solution(String[] keymap, String[] targets) {
      int[] answer = {};

      for(int i = 0 ; i < targets.length ; i ++){
        String target = targets[i];
        for(int j = 0 ; j < target.length(); j ++){
          String str = Character.toString(target.charAt(j));

          int min = Integer.MAX_VALUE;
          for(int k = 0 ;  k < keymap.length; k ++){
            if(keymap[k].contains(str)){
              if(keymap[k].indexOf(str)+1 < min){
                min = keymap[k].indexOf(str)+1;
              }
            }
          }


        }
      }
      return answer;
    }
  }

}
