#include <iostream>
#include <queue>
#include <vector>

using namespace std;

//OBI 2010 - Reunião

struct Grafo {
    int vertice, dist;

    bool operator<(const Grafo& other) const {
       return dist > other.dist;
    }
};

int dijkstra(vector<vector<pair<int, int>>>& grafo, int start, int end) {
    vector<int> dists(grafo.size(), INT32_MAX);
    dists[start] = 0;

    priority_queue<Grafo> fila;
    fila.push({start, 0});
    
    while(!fila.empty()) {
        int vertice = fila.top().vertice;
        fila.pop();

        for (int i = 0; i < grafo[vertice].size(); i++) {
            int adj = grafo[vertice][i].first;
            int custo = grafo[vertice][i].second;
            if (dists[adj] > dists[vertice] + custo) {
                dists[adj] = dists[vertice] + custo;
                fila.push({adj, dists[adj]});
            }
        }
    }
    return dists[end];
}

int main() {
    int N, M;
    cin >> N >> M;

    vector<vector<pair<int, int>>> cidade(N);

    for (int i = 0; i < M; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        cidade[u].push_back({v, w});
        cidade[v].push_back({u, w});
    }
    int menorDistancia = dijkstra(cidade, 0, N-1);
    cout << menorDistancia << endl;

    return 0;
}