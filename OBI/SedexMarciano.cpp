#include <iostream>
using namespace std;

// Sedex Marciano - OBI 2010

int main() {
  int l, a, p, r;
  
  cin >> l >> a >> p >> r;
  
  if ((l*l) + (a*a) + (p*p) <= (4*r*r)) {
      cout << "S" << endl;
  } else {
      cout << "N" << endl;
  }
  
  return 0;
}