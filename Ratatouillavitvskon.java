import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ratatouillavitvskon {
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] lab = new char[n][m];
        int sx = 0, sy = 0, fx = 0, fy = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lab[i][j] = scanner.next().charAt(j);
                if (lab[i][j] == 'R') {
                    sx = i;
                    sy = j;
                } else if (lab[i][j] == 'Q') {
                    fx = i;
                    fy = j;
                }
            }
        }
        int d = BFS(lab, sx, sy, fx, fy);
        System.out.println(d+1);
    }

    // Busca em grafo
   private static int BFS(char[][] labirinto, int sx, int sy, int fx, int fy) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[labirinto.length][labirinto[0].length];
        queue.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] coord = queue.poll();
                int x = coord[0];
                int y = coord[1];
                if (x == fx && y == fy) return distance;
                
                for (int[] direction : directions) {
                    int newX = x + direction[0];
                    int newY = y + direction[1];
                    if (isValid(labirinto, visited, newX, newY)) {
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
            distance++;
        }
        return 0;
    }

    private static boolean isValid(char[][] labirinto, boolean[][] visited, int x, int y) {
        return x >= 0 && y >= 0 && x < labirinto.length && y < labirinto[0].length && labirinto[x][y] != '#' && !visited[x][y];
    }
}