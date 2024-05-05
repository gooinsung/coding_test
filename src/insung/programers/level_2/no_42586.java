package insung.programers.level_2;

import java.util.ArrayList;
import java.util.List;

public class no_42586 {
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> list = new ArrayList<>();

            int[] days = new int[progresses.length];

            for (int i = 0; i < progresses.length; i++) {
                int progress = progresses[i];
                int speed = speeds[i];
                days[i] = (100 - progress) % speed == 0 ? (100 - progress) / speed : (100 - progress) / speed + 1;
            }

            int currentDay = days[0];
            int count = 1;

            for (int i = 1; i < days.length; i++) {
                if(days[i] <= currentDay){
                    count++;
                }else{
                    list.add(count);
                    currentDay = days[i];
                    count = 1;
                }
            }

            list.add(count);

            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        solution.solution(progresses, speeds);
    }
}
