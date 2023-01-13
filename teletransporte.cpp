#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<vector<int>> adj; // Grafo

//BFS
int BFS(int s, int t) {
    vector<int> dist(adj.size(), -1);

    queue<int> q;
    q.push(s);
    dist[s] = 0;

    // Enquanto a fila não estiver vazia...
    while (!q.empty()) {
        int u = q.front();
        q.pop();

        for (int v : adj[u]) {
            // Se o vértice v ainda não foi visitado...
            if (dist[v] == -1) {
                // Marca o vértice v como visitado e o insere na fila
                dist[v] = dist[u] + 1;
                q.push(v);
            }
        }
    }
    return dist[t];
}

int main() {
    int n, k, m;
    cin >> n >> k >> m;
    adj.resize(m*k);
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < k; j++) {
           int u;
           cin >> u;
           adj[i].push_back(u-1);
        }
    }
    int distance = BFS(0, n-1);
    cout << distance << endl;
 
    return 0;  
}