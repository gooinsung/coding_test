package insung.programers.level_2;

import java.util.LinkedList;

public class no_17680 {
    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            if (cacheSize == 0) return cities.length * 5;
            LinkedList<String> cache = new LinkedList<>();

            for (String city : cities) {
                city = city.toLowerCase();
                if (cache.contains(city)) {
                    cache.remove(city);
                    cache.add(city);
                    answer += 1;
                } else {
                    if(cache.size() == cacheSize) cache.removeFirst();

                    cache.addLast(city);
                    answer+=5;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        System.out.println(solution.solution(cacheSize, cities));
    }
}
