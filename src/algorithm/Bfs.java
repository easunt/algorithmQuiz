package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public static void dfs(int[][] matrix, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();

            for(int i=0;i < matrix.length ; i++) {
                if(matrix[currentNode][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[start] = true;
                }
            }
        }
    }
}
