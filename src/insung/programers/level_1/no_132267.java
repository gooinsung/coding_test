package insung.programers.level_1;

public class no_132267 {

  public static void main(String[] args) {
    Solution s = new Solution();

    System.out.println(s.solution(3,1,20));

  }
  static class Solution {
    public int solution(int a, int b, int n) {
      int result = 0;

      while(true){
        result+= n/a*b;
        n = n/a*b + n%a;

        if(n<a) break;
      }

      return result;
    }
  }
}
