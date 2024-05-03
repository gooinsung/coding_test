package insung.programers.level_2;

import java.util.HashMap;
import java.util.Map;

public class no_131127 {
    static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            Map<String, Integer> want_map = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                want_map.put(want[i], number[i]);
            }

            Map<String, Integer> discount_map = new HashMap<>();

            for (int i = 0; i < 10; i++) {
                discount_map.put(discount[i], discount_map.getOrDefault(discount[i], 0) + 1);
            }
            if(isSameMap(want_map, discount_map)) answer++;

            for (int i = 1; i <= discount.length - 10; i++) {
                String in = discount[i+9];
                String out = discount[i-1];

                discount_map.put(in, discount_map.getOrDefault(in, 0) + 1);
                discount_map.put(out, discount_map.getOrDefault(out, 1) -1);
                if(discount_map.getOrDefault(discount[i], 0) == 0)discount_map.remove(discount[i]);
                if(isSameMap(want_map, discount_map))
                    answer++;
            }

            return answer;
        }
        public boolean isSameMap(Map<String, Integer> wantMap, Map<String, Integer> discountMap){
            for(String key : wantMap.keySet()){
                if(discountMap.getOrDefault(key, 0) < wantMap.get(key)){
                    return false;
                }
            }

            return true;
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution.solution(want, number, discount));
    }
}
