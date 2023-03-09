// Dada uma sequência de números A1, A2..., An de tamanho N.
// Cada termo desta sequência é um número inteiro entre 1 e M
// Definida uma nova sequência B1, B2, ..., Bm de comprimento M como se segue.
// para cada j, o valor de Bj, é igual ao número de inteiros i de tal forma que Ai = j.
// Objetivo: Encontrar o valor máximo da sequência B.


#include <bits/stdc++.h>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    
    vector<int> A(N+1), B(M+1);
    
    for (int i = 1; i <= N; i++) {
        cin >> A[i];
    }
    
    for (int j = 1; j <= N; j++) {
        B[A[j]]++;
    }
    
    int max = *max_element(B.begin(), B.end());
    
    cout << max;

    return 0;
}