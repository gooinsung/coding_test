package insung.programers.review;

public class test_6 {
    static class Solution {

        public int solution(String[] babbling) {
            int answer = 0;
            String[] speakList = {"aya", "ye", "woo", "ma"};

            for (int i = 0; i < babbling.length; i++) {
                String word = babbling[i];

                if(word.contains("ayaaya") ||
                word.contains("yeye") ||
                word.contains("woowoo")||
                word.contains("mama")){
                    continue;
                }

                word = word.replace("aya", " ");
                word = word.replace("ye", " ");
                word = word.replace("woo", " ");
                word = word.replace("ma", " ");
                word = word.replace(" ","");

                if(word.length() == 0) answer++;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution.solution(arr));
    }
}
