package insung.programers.level_2;

import java.util.ArrayList;
import java.util.List;

public class no_43165 {
    static class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            String str = Integer.toString(n,k);

            StringBuilder sb = new StringBuilder();

            sb.append(str.charAt(0));
            for(int i = 1 ; i < str.length(); i++){
                char c = str.charAt(i);
                if(c == '0'){
                    if(!sb.toString().isEmpty()){
                        if(isPrime(Long.parseLong(sb.toString()))){
                            answer++;
                        }
                    }

                    sb = new StringBuilder();
                }else{
                    sb.append(c);
                }
            }
            if(isPrime(Integer.parseInt(sb.toString()))) answer++;
            return answer;
        }

        public boolean isPrime(long num){
            if(num <= 1) return false;
            if(num == 2) return true;

            if(num%2 == 0) return false;

            for(int i = 3 ; i < Math.sqrt(num); i+=2){
                if(num%i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 110011;
        int k = 10;

        System.out.println(solution.solution(n,k));

    }
}
