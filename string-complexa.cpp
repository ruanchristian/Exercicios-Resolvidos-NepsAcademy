#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
    int N, count = 0;
    string S;
    cin >> N >> S;
   
    if (S.find("A") != string::npos) count++;
    if (S.find("B") != string::npos) count++;
    if (S.find("C") != string::npos) count++;
    if (S.find("D") != string::npos) count++;
    if (S.find("E") != string::npos) count++;
    
    if (count >= 3) cout << "Yes" << endl;
    else cout << "No" << endl;
 
    return 0;
}