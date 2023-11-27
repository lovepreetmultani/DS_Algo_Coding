import java.util.LinkedList;
import java.util.Queue;

public class LabyrinthGrid {
    public static void main(String[] args) {
        int rows = 5, cols = 5;
        int[][] grid = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        int shortestPathLength = shortestPath(rows, cols, grid);
        System.out.println("The length of the shortest path is: " + shortestPathLength);
    }

    public static int shortestPath(int rows, int cols, int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0}); // x, y, distance

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], distance = current[2];

            if (x == rows - 1 && y == cols - 1) {
                return distance;
            }

            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && !visited[newX][newY] && grid[newX][newY] == 0) {
                    queue.add(new int[]{newX, newY, distance + 1});
                    visited[newX][newY] = true;
                }
            }
        }
        return -1;
    }
}



