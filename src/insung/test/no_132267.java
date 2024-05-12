package insung.test;

public class no_132267 {
    static class Solution {
        public int solution(int a, int b, int n) {
        int answer = 0;
        return answer;
      }

      public void coke(int a, int b,int bottle, int result){
            if(bottle < a) return;
            result+=bottle/a*b;
            bottle = result + bottle%a;
            coke(a, b, bottle, result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int a = 2;
        int b = 1;
        int n = 20;
        int result = 0;
        solution.coke(a,b,n, result);
        System.out.println(result);
    }
}
