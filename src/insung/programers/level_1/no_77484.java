package insung.programers.level_1;

public class no_77484 {

  public static void main(String[] args) {
    Solution s = new Solution();



  }
  static class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      int[] answer = new int[2];

      int matchCount = 0;
      int zeroCount = 0;
      int maxScore;
      int minScore;
      for(int i = 0; i < 6; i++){
        if(lottos[i] != 0){
          for(int j = 0; j < 6; j++){
            if(lottos[i] == win_nums[j]){
              matchCount++;
              continue;
            }
          }
        }else{
          zeroCount++;
        }
      }
      maxScore = matchCount+zeroCount;
      minScore = matchCount;
      answer[0] = this.lotto(maxScore);
      answer[1] = this.lotto(minScore);

      return answer;
    }

    public int lotto(int a){
      int result;

      switch (a){
        case 6 : result=1;break;
        case 5 : result=2;break;
        case 4 : result=3;break;
        case 3 : result=4;break;
        case 2 : result=5;break;
        default: result = 6;
      }

      return result;
    }
  }
}
