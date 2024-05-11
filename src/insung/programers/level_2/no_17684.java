package insung.programers.level_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class no_17684 {
    static class Solution {
        public int[] solution(String msg) {
            int[] answer = {};
            msg = msg.toUpperCase();
            Map<String, Integer> alphabet = new HashMap<>();

            List<Integer> list = new ArrayList<>();

            int index = 1;
            for (char i = 'A'; i <= 'Z'; i++) {
                alphabet.put(Character.toString(i), index++);
            }


            char[] arr = msg.toCharArray();

            String str = "";
            int last = 26;
            for (int i = 0; i < arr.length; i++) {
                String s = Character.toString(arr[i]);
                String st = str + s;

                if (alphabet.containsKey(st)) {
                    str = st;
                } else {
                    list.add(alphabet.get(str));
                    alphabet.put(st, ++last);
                    str = s;
                }
            }

            if(!str.equals("")) list.add(alphabet.get(str));

            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("kakao"));
    }
}
