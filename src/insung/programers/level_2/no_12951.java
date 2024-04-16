package insung.programers.level_2;

public class no_12951 {
    static class Solution {
        public String solution(String s) {
            String[] arr = s.split(" ");

            StringBuilder sb = new StringBuilder();
            for (String str : arr) {
                if (str.length() == 0) {
                    sb.append(" ");
                } else {
                    sb.append(str.substring(0,1).toUpperCase());
                    sb.append(str.substring(1,str.length()).toLowerCase());
                    sb.append(" ");
                }
            }

            if(sb.substring(0, sb.length()-1).equals(" ")) return sb.toString();

            return sb.substring(0, sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "3people unFollowed me ";

        System.out.println(solution.solution(s));

    }
}
