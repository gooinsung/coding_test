package insung.programers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class no_42587 {
    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<Priority> queue = new LinkedList<>();
            for (int i = 0; i < priorities.length; i++) {
                Priority p = new Priority(i, priorities[i]);
                queue.add(p);
            }

            while (!queue.isEmpty()) {
                Priority current = queue.poll();

                boolean isHighest = true;

                for (Priority p : queue) {
                    if (p.priority > current.priority) {
                        isHighest = false;
                        break;
                    }
                }

                if (!isHighest) {
                    queue.add(current);
                } else {
                    answer++;
                    if(current.key == location) return answer;
                }


            }

            return answer;
        }


        class Priority {
            Integer key;
            Integer priority;

            public Priority(Integer key, Integer priority) {
                this.key = key;
                this.priority = priority;
            }


        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        System.out.println(solution.solution(priorities, location));
    }
}
