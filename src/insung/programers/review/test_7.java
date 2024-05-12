package insung.programers.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_7 {
    static class Solution {
        public int[] solution(int N, int[] stages) {
            Map<Integer, Integer> reahchMap = new HashMap<>();
            Map<Integer, Integer> unclearMap = new HashMap<>();

            for (int i = 0; i < stages.length; i++) {
                int stage = stages[i];
                for (int j = 1; j <= stage; j++) {
                    reahchMap.put(j, reahchMap.getOrDefault(j, 0) + 1);
                }

                if (stage <= N) unclearMap.put(stage, unclearMap.getOrDefault(stage, 0) + 1);
            }

            List<Stage> stageList = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                int reached = reahchMap.getOrDefault(i, 0);
                int unClear = unclearMap.getOrDefault(i, 0);
                double fail = reached > 0 ? (double) unClear / reached : 0;
                stageList.add(new Stage(i, fail));
            }

            for(Stage stage:stageList){
                System.out.print(stage.stage+" "+stage.fail);
                System.out.println();
            }

            stageList.sort((a,b)->{
                if (b.fail != a.fail) {
                    return Double.compare(b.fail, a.fail);
                } else {
                    return Integer.compare(a.stage, b.stage);
                }
            });

            int[] answer = new int[N];
            for (int i = 0; i < N; i++) {
                answer[i] = stageList.get(i).stage;
            }


            return answer;
        }

        class Stage {
            int stage;
            double fail;

            public Stage(int stage, double fail) {
                this.stage = stage;
                this.fail = fail;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution.solution(n, stages);
    }
}
