// Rat in a maze


import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> result = FPIM(maze);
        System.out.println("Possible paths: " + result);
    }

    private static void fp(int[][] maze, int x, int y, int n, boolean[][] vist, String path, List<String> paths) {
        // Base Case: If destination (n-1, n-1) is reached
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        // Possible moves: Down, Right, Up, Left
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] move = {'D', 'R', 'U', 'L'};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // Check if the move is valid
            if (isValid(newX, newY, n, maze, vist)) {
                // Mark as visited
                vist[newX][newY] = true;
                // Recursive call with updated path
                fp(maze, newX, newY, n, vist, path + move[i], paths);
                // Backtrack (unmark visited for other paths)
                vist[newX][newY] = false;
            }
        }
    }

    private static boolean isValid(int x, int y, int n, int[][] maze, boolean[][] vist) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !vist[x][y];
    }

    public static List<String> FPIM(int[][] maze) {
        List<String> paths = new ArrayList<>();
        int n = maze.length;

        // If starting or ending cell is blocked, return empty list
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return paths;
        }

        boolean[][] vist = new boolean[n][n];
        vist[0][0] = true;

        // Start recursive search from (0,0)
        fp(maze, 0, 0, n, vist, "", paths);

        return paths;
    }
}