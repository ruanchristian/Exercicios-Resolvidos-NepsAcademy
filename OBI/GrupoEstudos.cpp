#include <iostream>
#include <set>

using namespace std;

int main() {
    int N;
    cin >> N;
    set<int> materias;
    int x;

    for(int i = 0; i < N; i++) {
       cin >> x;
       materias.insert(x);
    }

    cout << materias.size() << endl;
    return 0;
}