package insung.test;

import java.util.*;
import java.util.stream.Collectors;

public class test_05_11_01 {

    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            Queue<String> cache = new LinkedList<>();

            for(int i = 0; i < cities.length; i++){
                String city = cities[i].toLowerCase();
                if(cache.isEmpty()){
                    cache.add(city);
                    answer+=5;
                    continue;
                }


                boolean have = false;
                for(String s: cache){
                    if(s.equals(city)){
                        have = true;
                        break;
                    }
                }

                if(have) answer+=1;
                else answer+=5;

                if(cache.size() >= cacheSize){
                    cache.poll();
                }
                cache.add(city);

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] a = {"a","b","c","d"};
        String[] b = {"c","b"};


        Set<String> aSet = Arrays.stream(a).collect(Collectors.toSet());
        Set<String> bSet = Arrays.stream(b).collect(Collectors.toSet());

        aSet.removeAll(bSet);

        System.out.println(aSet);
    }
}
