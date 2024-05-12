package insung.programers.review;

public class test_3 {
    static class Solution {
        public String solution(String phone_number) {
            String answer = "";
            String last = phone_number.substring(phone_number.length()-4,phone_number.length());
            String front = "";
            for(int i = 0 ; i < phone_number.length()-4 ; i++){
                front+="#";
            }
            return front+last;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
