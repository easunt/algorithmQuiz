import solutions.Solution1;
import solutions.Solution2;

public class Main {

    public static void main(String[] args) {
        //Test for solution 1
        Solution1 sol1 = new Solution1();
        int[] budgets = {150, 222, 264, 555, 200};
        System.out.println(sol1.solution(budgets, 1000));

        //Test for solution 2
        Solution2 sol2 = new Solution2();
        System.out.println(sol2.solution("()(((()())(())()))(())"));
    }
}
