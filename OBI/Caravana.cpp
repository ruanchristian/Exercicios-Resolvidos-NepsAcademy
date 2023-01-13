#include <iostream>

using namespace std;

int main() {
  int N, somaPesos = 0;
  cin >> N;
  int pesos[N];

  for (int i = 0; i < N; i++) {
    cin >> pesos[i];
    somaPesos += pesos[i];
  }
  
  int media = somaPesos / N;

  for (int i = 0; i < N; i++) {
    cout << media - pesos[i] << endl;
  }
  
  return 0;
}