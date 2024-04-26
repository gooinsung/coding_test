package insung.programers.level_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class no_12081 {
    static class Solution {
        public int[] solution(int n, String[] words) {
            Set<String> usedWords = new HashSet<>();  // 이미 사용된 단어들을 저장할 HashSet
            String lastWord = words[0];  // 첫 단어를 초기 단어로 설정
            usedWords.add(lastWord);  // 첫 단어를 사용된 단어에 추가

            for (int i = 1; i < words.length; i++) {
                String currentWord = words[i];

                // 이전 단어의 마지막 글자와 현재 단어의 첫 글자가 다르거나, 단어가 이미 사용되었거나, 단어가 한 글자인 경우
                if (lastWord.charAt(lastWord.length() - 1) != currentWord.charAt(0) || usedWords.contains(currentWord)) {
                    // 탈락한 사람의 번호와 차례 계산
                    return new int[]{(i % n) + 1, (i / n) + 1};
                }

                // 현재 단어를 사용된 단어에 추가하고 마지막 단어 업데이트
                usedWords.add(currentWord);
                lastWord = currentWord;
            }

            // 모든 단어가 규칙에 맞게 사용되었다면 탈락자 없음
            return new int[]{0, 0};
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        String[] arr = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] answer = solution.solution(n, arr);

        for (int a : answer) {
            System.out.println(a);
        }

    }
}
