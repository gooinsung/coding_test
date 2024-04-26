package insung.programers.level_2;


import java.util.*;
import java.util.stream.Stream;

public class no_64065 {
    static class Solution {
        public static int[] solution(String s) {
            s = s.replaceAll("\\{", "");
            String[] sArr = s.substring(0, s.length() - 2).split("\\}\\,");
            Arrays.sort(sArr, Comparator.comparingInt(String::length));

            HashSet<Integer> duplicate = new HashSet<>();
            ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i < sArr.length; i++) {
                int[] tuple = Stream.of(sArr[i].split(",")).mapToInt(Integer::parseInt).toArray();
                for (int num : tuple) {
                    if (!duplicate.contains(num)) {
                        result.add(num);
                    }
                    duplicate.add(num);
                }
            }

            int[] answer = new int[result.size()];

            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        String str = "{{123}}";

        Solution solution = new Solution();
        for(int i : solution.solution(str)){
            System.out.print(i);
        }

    }
}
