#include <iostream>
#include <queue>
#include <vector>

using namespace std;

//OBI 2017 - Frete

struct Grafo {
    int vertice, dist;

    bool operator<(const Grafo& other) const {
       return dist > other.dist;
    }
};

//Algoritmo de dijkstra
int dijkstra(vector<vector<pair<int, int>>>& grafo, int start, int end) {
    vector<int> dists(grafo.size(), INT32_MAX);
    dists[start] = 0;

    priority_queue<Grafo> fila;
    fila.push({start, 0});
    
    vector<int> predecessors(grafo.size(), -1);

    while(!fila.empty()) {
        int vertice = fila.top().vertice;
        fila.pop();

        for (int i = 0; i < grafo[vertice].size(); i++) {
            int adj = grafo[vertice][i].first;
            int custo = grafo[vertice][i].second;
            if (dists[adj] > dists[vertice] + custo) {
                dists[adj] = dists[vertice] + custo;
                predecessors[adj] = vertice;
                fila.push({adj, dists[adj]});
            }
        }
    }
    return dists[end];
}

int main() {
    int N, M;
    cin >> N >> M;
    vector<vector<pair<int, int>>> grafo(N);
     
    int a, b, c;
    for (int i = 0; i < M; i++) {
        cin >> a >> b >> c;
        a--; b--;
        grafo[a].push_back({b, c});
        grafo[b].push_back({a, c});
    }
    int minDist = dijkstra(grafo, 0, N-1);
    cout << minDist << endl;
    
    return 0;
}