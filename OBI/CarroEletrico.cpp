#include <iostream>
#include <cmath>
#include <algorithm>

// CARRO ELÉTRICO - (OBI 2022)

using namespace std;

const int MAXN = 400400;

int n, d;
int x[MAXN], y[MAXN];
int p[MAXN], sz[MAXN];

int find (int x) {
  if (x != p[x]) p[x] = find(p[x]);
  return p[x];
}

void mergeSort(int u, int v) {
  int pu = find(u), pv = find(v);
  if (pu != pv) {
      if (sz[pu] < sz[pv])
  	  swap(pu, pv);
      sz[pu] += sz[pv];
      p[pv] = pu;
    }
}

int main() {
  scanf ("%*d%*d%d%d", &n, &d);

  for (int i = 0; i < n; i++) {
      scanf("%d%d", &x[i], &y[i]);
      p[i] = i;
      sz[i] = 1;
    }

  for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
	  if (100 * (abs(x[i] - x[j]) + abs(y[i] - y[j])) <= d) {
	      mergeSort(i, j);
	    }
	}
}

  int viagens = 0;
  for (int i = 0; i < n; i++) {
      if(p[i] == i) viagens++;
    }

  cout << viagens-1 << endl;

  return 0;
}