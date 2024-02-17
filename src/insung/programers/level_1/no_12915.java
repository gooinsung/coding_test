package insung.programers.level_1;

import java.util.Arrays;

public class no_12915 {

  static class Solution {
    public String[] solution(String[] strings, int n) {
      return Arrays.stream(Arrays.stream(strings)
              .map(x->x.charAt(n)+x)
              .sorted().toArray(String[]::new))
          .map(x->x.substring(1,x.length()))
          .toArray(String[]::new);
    }
  }


  public static void main(String[] args) {
    Solution s = new Solution();
    for (String str : s.solution(new String[]{"sun", "bed", "car"}, 1)) {
      System.out.println(str);
    }

  }

}
