package insung.programers.level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;


public class no_42626 {
    static class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;

            PriorityQueue<Integer> queue = new PriorityQueue<>();

            for(int a:scoville){
                queue.offer(a);
            }

            while (queue.size() > 1 && queue.peek() < K){

                int first = queue.poll();
                int secound = queue.poll();

                int food = first + (secound*2);
                answer++;
                queue.offer(food);
            }

            if(queue.peek() < K) return -1;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr= {1, 2, 3, 9, 10, 12};
        System.out.println(solution.solution(arr, 7));
    }
}
