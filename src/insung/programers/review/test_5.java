package insung.programers.review;

public class test_5 {
    static class Solution {
        public String solution(String s) {
            String answer = "";

            if(s.length()%2 == 0)
                return s.substring(s.length()/2-1,s.length()/2+1);

            else
                return s.substring(s.length()/2, s.length()/2+1);

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str = "12345";
        String str2 = "1234";

        System.out.println(str.substring(str.length()/2, str.length()/2+1));
    }
}
