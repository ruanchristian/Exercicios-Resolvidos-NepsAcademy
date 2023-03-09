// Dado um conjunto de N pontos sobre uma circunferência de um círculo
// todo par de pontos está ligado por um segmento e três desses segmentos nunca se encontram em um ponto interno à circunferência.
// Objetivo: determinar em quantas partes esses segmentos dividem o interior do círculo.

#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    long long int resto = (pow(n, 4) - (6*pow(n, 3)) + (23*pow(n, 2)) - (18 * n) + 24) / 24;
    
    cout << resto << endl;
    
    return 0;
}
