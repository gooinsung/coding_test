package insung.programers.level_1;


public class no_17682 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution("1S2D*3T"));
  }
  static class Solution {
    public int solution(String dartResult) {
      int answer = 0;

      int[]point = new int[3];
      int idx = 0;
      int n=0;
      String numStr = "0";



      for(int i = 0; i < dartResult.length(); i++){
        char c = dartResult.charAt(i);

        if(c>='0' && c<='9'){
          numStr+=String.valueOf(c);
        }

        else if(c == 'S' || c == 'D' || c == 'T'){
          n = Integer.parseInt(numStr);
          if(c == 'S'){
            point[idx++] = (int)Math.pow(n,1);
          }else if(c == 'D'){
            point[idx++] = (int)Math.pow(n,2);
          }else{
            point[idx++] = (int)Math.pow(n,3);
          }
          numStr="0";
        }
        else{
          if(c == '*'){
            point[idx-1]*=2;
            if(idx-2 >= 0) point[idx-2]*=2;
          }else{
              point[idx-1]*=(-1);
          }
        }
      }

      answer = point[0] + point[1] + point[2];


      return answer;
    }
  }

}
