#include <iostream>

using namespace std;

int main() {
  int a = 12, b = 18, index = 0, auxiliar1 = 12, auxiliar2 = 18;

  while (a <= 38) {
    cout << "a = " << a << " <-> " << "b = " << b << endl;
    index++;

    if (a == 38) break;

    a += 2;
    b -= 2;

    if (index % 2 == 0) { 
      auxiliar1 = a;
      auxiliar2 = b;
      a += 2;
      b -= 2;
    } else if (index % 3 == 0) {
      a = auxiliar1 - 3;
      b = auxiliar2 + 5;
      index = 0;
    } 
  }  
  return 0;
}