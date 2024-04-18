package insung.programers.level_2;

public class no_12945 {

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            /*int[] arr = new int[n];
            arr[1] = 1;
            arr[2] = 1;

            for (int i = 3; i < n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }

            for(int i = 1 ; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

            answer = arr[n-1]%1234567;*/

            int prev = 1;
            int prevPrev = 1;

            int a = 0;
            for (int i = 3; i <= n; i++) {
                a = prev + prevPrev;
                prevPrev = prev;
                prev = a % 1234567;
            }

            answer = a%1234567;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(5));

    }
}
