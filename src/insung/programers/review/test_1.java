package insung.programers.review;

public class test_1 {
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            s = s.toUpperCase();

            if(!s.contains("P") && !s.contains("Y")) return true;
            int pCount = 0;
            int yCount = 0;
            for(char c : s.toCharArray()){
                if(c == 'P') pCount++;
                if(c == 'Y') yCount++;
            }

            return pCount==yCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
