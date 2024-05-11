package insung.programers.level_2;

import java.util.Arrays;

public class no_42577 {

    static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            Arrays.sort(phone_book);

            for(String str : phone_book){

                for(int i = 0; i < phone_book.length; i++){
                    if(!str.equals(phone_book[i])){
                        String str2 = phone_book[i];
                        if(str2.length()>=str.length()){
                            if(str.equals(str2.substring(0,str.length()))) answer= false;
                        }
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] arr= {"123","456","789"};
        System.out.println(solution.solution(arr));
    }
}
