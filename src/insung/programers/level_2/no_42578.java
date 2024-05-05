package insung.programers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class no_42578 {

    static class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            Map<String, List<String>> map = new HashMap<>();

            for (String[] item : clothes) {
                String name = item[0];
                String type = item[1];

                List<String> list = map.getOrDefault(type, new ArrayList<>());
                list.add(name);
                map.put(type, list);
            }

            for (List<String> list : map.values()) {
                answer*=list.size()+1;
            }


            return answer-1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        System.out.println(solution.solution(clothes));
    }
}
