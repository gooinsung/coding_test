package insung.programers.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class no_12941 {
    static class Solution {
        public int solution(int[] A, int[] B) {

            int result = 0;
            Arrays.sort(A);
            Arrays.sort(B);
            for (int i = 0; i < A.length; i++) {
                result += A[i]*B[B.length-i-1];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {1, 2};
        int[] B = {3, 4};

        Solution solution = new Solution();
        System.out.println(solution.solution(A,B));
    }
}
