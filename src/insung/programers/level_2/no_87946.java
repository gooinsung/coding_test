package insung.programers.level_2;

public class no_87946 {
    static class Solution {
        int maxDungeons = 0;

        // 재귀를 통해 배열의 순열을 생성하고, 각 순열에 대한 최대 던전 탐험 횟수를 계산
        private void permute(int[][] dungeons, int start, int currentFatigue) {
            if (start == dungeons.length) {
                // 모든 순열이 완성된 상태에서 최대 탐험 횟수 계산
                int count = 0;
                int remainingFatigue = currentFatigue;
                for (int[] dungeon : dungeons) {
                    if (remainingFatigue >= dungeon[0]) {
                        remainingFatigue -= dungeon[1];
                        count++;
                    }
                }
                maxDungeons = Math.max(maxDungeons, count);
                return;
            }

            for (int i = start; i < dungeons.length; i++) {
                swap(dungeons, start, i);
                permute(dungeons, start + 1, currentFatigue);
                swap(dungeons, start, i);
            }
        }

        private void swap(int[][] array, int a, int b) {
            int[] temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }

        public int solution(int k, int[][] dungeons) {
            permute(dungeons, 0, k);
            return maxDungeons;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int k = 80;
        int[][] dungeons = {{80,20}, {50,40}, {30,10}};
        solution.solution(k, dungeons);
    }
}
