package algorithm;

import java.util.Stack;

public class Dfs {

    public static void dfs(int[][] matrix, boolean[] visited, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while(!stack.isEmpty()) {
            boolean flag = false;
            int current = stack.peek();

            for(int i = 0; i < matrix.length; i++) {
                if(matrix[current][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                stack.pop();
            }
        }
    }
}
