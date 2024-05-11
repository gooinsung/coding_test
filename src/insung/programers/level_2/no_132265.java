package insung.programers.level_2;

import java.util.*;
import java.util.stream.Collectors;

public class no_132265 {
    static class Solution {
        public int solution(int[] topping) {
            HashMap<Integer, Integer> rightMap = new HashMap<>();
            HashMap<Integer, Integer> leftMap = new HashMap<>();

            // 전체 토핑을 rightMap에 카운트하여 추가
            for (int t : topping) {
                rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
            }

            int count = 0;
            int leftUnique = 0;
            int rightUnique = rightMap.size(); // 오른쪽 맵의 고유 토핑 수

            // 토핑 배열을 순회하면서 각 분할 위치에서 맵을 업데이트
            for (int i = 0; i < topping.length - 1; i++) {
                int currentTopping = topping[i];

                // 왼쪽 맵 업데이트
                leftMap.put(currentTopping, leftMap.getOrDefault(currentTopping, 0) + 1);
                if (leftMap.get(currentTopping) == 1) { // 새로운 토핑이 추가된 경우
                    leftUnique++;
                }

                // 오른쪽 맵 업데이트
                if (rightMap.get(currentTopping) == 1) { // 해당 토핑이 마지막 한 개 남은 경우
                    rightMap.remove(currentTopping);
                    rightUnique--;
                } else {
                    rightMap.put(currentTopping, rightMap.get(currentTopping) - 1);
                }

                // 두 맵의 고유 토핑 수 비교
                if (leftUnique == rightUnique) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] toppings = {1, 2, 3, 1, 4};

        System.out.println(solution.solution(toppings));
    }
}
