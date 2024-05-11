package insung.programers.level_2;

import java.util.HashMap;
import java.util.Map;

public class no_17677 {

    static class Solution {
        public int solution(String str1, String str2) {
            Map<String, Integer> multiset1 = createMultiset(str1);
            Map<String, Integer> multiset2 = createMultiset(str2);

            int intersectionSize = 0;
            int unionSize = 0;

            // Combine keys from both multisets
            Map<String, Integer> combinedKeys = new HashMap<>(multiset1);
            combinedKeys.putAll(multiset2);

            for (String key : combinedKeys.keySet()) {
                int count1 = multiset1.getOrDefault(key, 0);
                int count2 = multiset2.getOrDefault(key, 0);

                intersectionSize += Math.min(count1, count2);
                unionSize += Math.max(count1, count2);
            }

            double jaccardIndex = (unionSize == 0) ? 1 : (double) intersectionSize / unionSize;
            return (int) (jaccardIndex * 65536);
        }

        public Map<String, Integer> createMultiset(String str) {
            Map<String, Integer> multiset = new HashMap<>();
            String lowerCaseStr = str.toLowerCase();

            for (int i = 0; i < lowerCaseStr.length() - 1; i++) {
                if (Character.isLetter(lowerCaseStr.charAt(i)) && Character.isLetter(lowerCaseStr.charAt(i + 1))) {
                    String pair = lowerCaseStr.substring(i, i + 2);
                    multiset.put(pair, multiset.getOrDefault(pair, 0) + 1);
                }
            }
            return multiset;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "FRANCE";
        String str2 = "french";


        System.out.println(solution.solution(str1, str2));

    }
}
