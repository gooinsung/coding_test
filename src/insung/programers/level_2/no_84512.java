package insung.programers.level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no_84512 {
    static class Solution {
        Character[] arr =  {'A','E','I','O','U'};
        public int solution(String word) {
            int answer = 0;
            List<String> list = new ArrayList<>();
            makeWords("", list, 5);
            Collections.sort(list);
            answer = list.indexOf(word) +1;
            return answer;
        }

        public void makeWords(String current, List<String> result, int maxLength){
            if(current.length() > maxLength) return;
            if(!current.isEmpty()) result.add(current);
            for(char c : arr){
                makeWords(current + c, result, maxLength);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("AAAAE");
    }
}
