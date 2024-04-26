package insung.programers.level_2;

public class no_42842 {
    static class Solution {
        public int[] solution(int brown, int yellow) {
            int total = brown + yellow;

            for (int height = 3; height <= (int)Math.sqrt(total); height++) {
                if (total % height == 0) {
                    int width = total / height;
                    if ((width - 2) * (height - 2) == yellow) {
                        return new int[]{width, height};
                    }
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {

        System.out.println((int)Math.sqrt(12));
    }
}
