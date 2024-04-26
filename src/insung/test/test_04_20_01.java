package insung.test;

public class test_04_20_01 {

    static class Solution {
      public String solution(String s) {
        if(s.length()%2 == 0){
            StringBuilder sb = new StringBuilder();
            return sb.append(s.charAt((s.length()/2)-1)).append(s.charAt(s.length()/2)).toString();
        }else{
            return Character.toString(s.charAt(s.length()/2));
        }
      }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("abcde"));
        System.out.println(solution.solution("abcdef"));


    }
}
