package insung.programers.level_2;

public class no_12949 {
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {

            int[][] answer = new int[arr1.length][arr2[0].length];

            for (int i = 0; i < arr1.length; i++) {
                int[] a = arr1[i];
                for (int j = 0; j < arr1[i].length; j++) {
                    int[] b = arr2[j];
                    for (int k = 0; k < arr2.length; k++) {
                        System.out.println(arr1[i][k] * arr2[k][i]);

                        answer[i][j] = arr1[i][k] * arr2[k][i];
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

    }
}
