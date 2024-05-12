package insung.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no_84512 {
    static class Solution {
        public int solution(String word) {
            int answer = 0;
            List<String> dictionary = new ArrayList<>();
            makeWord("", dictionary);

            answer = dictionary.indexOf(word)+1;
            return answer;
        }


        public void makeWord(String current, List<String> list) {
            Character[] charList = {'A', 'E', 'I', 'O', 'U'};
            if (current.length() > 5) return;
            if (!current.isEmpty()) list.add(current);
            for (char c : charList) {
                makeWord(current + c, list);
            }
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("AAAE");
    }
}
