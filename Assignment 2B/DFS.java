/*Write a java program to traverse a graph using depth first search (use
Stack collection ).*/
import java.util.*;
class DFS{
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 1},  
            {0, 0, 0, 1, 1, 1, 1, 0}
        };
        int[] visited = new int[graph.length];
        int start = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = 1;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            System.out.print(current + " ");
            for (int i = 0; i < graph.length; i++) {
                if (graph[current][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                }
            }
        }
    }
}