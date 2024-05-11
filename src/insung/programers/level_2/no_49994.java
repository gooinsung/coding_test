package insung.programers.level_2;

import java.util.HashSet;
import java.util.Set;

public class no_49994 {
    static class Solution {
        public int solution(String dirs) {
            int answer = 0;
            int min = -5;
            int mx = 5;

            Set<String> pathSet = new HashSet<>();

            int x = 0;
            int y = 0;

            for (char c : dirs.toCharArray()) {
                int newX = x;
                int newY = y;
                if (c == 'U' && y < 5) newY++;
                else if (c == 'D' && y > -5) newY--;
                else if (c == 'L' && x > -5) newX--;
                else if (c == 'R' && x < 5) newX++;

                if(newX != x || newY != y){
                    String path = x+","+y+","+newX+","+newY;
                    String path2 = newX+","+newY+","+x+","+y;

                    pathSet.add(path);
                    pathSet.add(path2);

                    x = newX;
                    y = newY;
                }
            }

            return pathSet.size()/2;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String dir = "ULURRDLLU";

        System.out.println(solution.solution(dir));
    }
}
