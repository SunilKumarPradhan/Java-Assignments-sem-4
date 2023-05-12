//Write a java program to traverse a graph using breadth first search (use ArrayDeque collection)
import java.util.*;
class BFS{
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
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = 1;
        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");
            for (int i = 0; i < graph.length; i++) {
                if (graph[current][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}