package solutions;

//<프로그래머스>
//최적 예산 구하기
public class Solution1 {
    public int solution(int[] budgets, int M) {
        int budgetSum = 0;
        for (int budget : budgets) {
            budgetSum += budget;
        }

        if(budgetSum <= M){
            int max = 0;
            for(int budget : budgets){
                if(max < budget)
                    max = budget;
            }
            return max;
        }
        else {
            int before = 0;
            int after = M / budgets.length;
            int sum = 0;
            while (true) {
                int higherCount = 0;
                int targetCount = 0;
                for (int budget : budgets) {
                    if (budget > before && budget <= after) {
                        sum += budget;
                        targetCount++;
                    } else if (budget > after) {
                        higherCount++;
                    }
                }
                if (targetCount == 0){
                    break;
                }
                if(higherCount > 0){
                    before = after;
                    after += (M - (sum + (after * higherCount))) / higherCount;
                }
            }
            return after;
        }
    }
}
