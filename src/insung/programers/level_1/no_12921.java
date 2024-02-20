package insung.programers.level_1;

public class no_12921 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(10));
  }

  static class Solution{
    public int solution(int n){
      int answer = 1;
      for(int i=3; i<=n;i++){
        if(this.isPrime(i)) answer++;
      }
      return answer;
    }

    public boolean isPrime(int n){
      for(int i=2; i<=(int)Math.sqrt(n); i++){
        if(n%i == 0){
          return false;
        }
      }
      return true;
    }
  }


}
