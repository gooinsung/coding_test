package insung.programers.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class no_12939 {
    static class Solution {
        public String solution(String str) {
            StringBuilder answer = new StringBuilder();

            String[] strArr = str.split(" ");

            int[] intArr = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }

            int min = Arrays.stream(intArr).min().getAsInt();
            int max = Arrays.stream(intArr).max().getAsInt();

            answer.append(min).append(" ").append(max);

            return answer.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(str));
    }


}
