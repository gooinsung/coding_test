package insung.programers.level_2;

public class no_70129 {
    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[2];
            int count = 0;
            int deleteCount = 0;

            while (true) {
                int originalLength = s.length();

                s = s.replace("0","");

                int zeroCount = (s.length() == originalLength) ? 0 : originalLength - s.length();
                deleteCount+=zeroCount;

                int length = originalLength - zeroCount;
                s = Integer.toBinaryString(length);

                count++;
                if (s.equals("1"))
                    break;
            }

            answer[0] = count;
            answer[1] = deleteCount;
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        for (int i : solution.solution("1111111")) {
            System.out.println(i);
        }
    }
}
