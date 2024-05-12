package insung.test;

public class no_12941 {
    static class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split(" ");

            for (String str : arr) {
                System.out.println(str);
                if(str.length() == 0){
                    answer+=" ";
                    continue;
                }
                answer+=str.substring(0,1).toUpperCase();
                answer+=str.substring(1,str.length()).toLowerCase();
                answer+=" ";
            }
            return answer.substring(0,answer.length()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Test This Is Test ";

        System.out.println(solution.solution(str));

    }
}
