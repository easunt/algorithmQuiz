import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import solutions.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Test for solution 1
        Solution1 sol1 = new Solution1();
        int[] budgets = {150, 222, 264, 555, 200};
        System.out.println(sol1.solution(budgets, 1000));

        //Test for solution 2
        Solution2 sol2 = new Solution2();
        System.out.println(sol2.solution("()(((()())(())()))(())"));

        //Test for solution 3
        Solution3 sol3 = new Solution3();
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(sol3.solution(100, 100, truck_weights));

        Solution4 sol4 = new Solution4();
        System.out.println(sol4.solution(6));

        Solution5 sol5 = new Solution5();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(sol5.solution(array, commands)));

        Solution6 sol6 = new Solution6();
        int[] array2 = {20,20,200};
        System.out.println(sol6.solution(array2));

        Solution7 sol7 = new Solution7();
        int[] array3 = {3,0,6,1,5};
        System.out.println(sol7.solution(array3));

        Solution8 sol8 = new Solution8();
        System.out.println(Arrays.toString(sol8.solution(4, 16)));

    }
}
