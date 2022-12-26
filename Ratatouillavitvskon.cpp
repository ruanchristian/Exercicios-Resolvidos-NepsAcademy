#include <iostream>
#include <queue>

// EM c++

using namespace std;

const int N = 105;

int directions[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

char lab[N][N];
bool visited[N][N];

struct Coord {
    int x, y;
};

bool isValid(int x, int y, int n, int m) {
    return x >= 0 && y >= 0 && x < n && y < m && lab[x][y] != '#' && !visited[x][y];
}

// Busca em grafo
int bfs(int sx, int sy, int fx, int fy, int n, int m) {
    queue<Coord> q;
    q.push({sx, sy});
    visited[sx][sy] = true;
    int distance = 0;

    while (!q.empty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            Coord coord = q.front();
            q.pop();
            int x = coord.x, y = coord.y;
            if (x == fx && y == fy) return distance;

            for (int j = 0; j < 4; j++) {
                int newX = x + directions[j][0];
                int newY = y + directions[j][1];
                if (isValid(newX, newY, n, m)) {
                    q.push({newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        distance++;
    }
    return 0;
}

int main() {
    int n, m;
    cin >> n >> m;

    int sx = 0, sy = 0, fx = 0, fy = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> lab[i][j];
            if (lab[i][j] == 'R') {
                sx = i;
                sy = j;
            }
            else if (lab[i][j] == 'Q') {
                fx = i;
                fy = j;
            }
        }
    }
    int d = bfs(sx, sy, fx, fy, n, m);
    cout << d + 1 << endl;
    return 0;
}