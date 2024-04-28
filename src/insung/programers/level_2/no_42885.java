package insung.programers.level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class no_42885 {
    static class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            Arrays.sort(people);

            int lt = 0;
            int rt = people.length-1;
            while (lt <= rt){
                if(people[lt] + people[rt] <= limit){
                    lt++;
                }
                rt--;
                answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{70, 50, 80, 50}, 100));
    }
}
