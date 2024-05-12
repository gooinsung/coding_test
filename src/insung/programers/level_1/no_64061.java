package insung.programers.level_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class no_64061 {
    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> basket = new Stack<>();

            for (int i = 0; i < moves.length; i++) {
                int move = moves[i] - 1;
                boolean onLoad = true;

                for (int k = 0; k < board.length; k++) {
                    if (!onLoad) break;
                    if (board[k][move] != 0) {
                        if (stackDoll(basket, board[k][move])) {
                            answer += 2;
                        }
                        board[k][move] = 0;
                        onLoad = false;
                        break;
                    }


                }
            }

            return answer;
        }

        public boolean stackDoll(Stack<Integer> basket, int doll) {
            if (basket.isEmpty()) {
                basket.add(doll);
                return false;
            }
            if (basket.peek() == doll) {
                basket.pop();
                return true;
            } else {
                basket.add(doll);
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution.solution(board, moves));
    }
}
