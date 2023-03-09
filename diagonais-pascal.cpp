// Objetivo: Escrever um programa que calcule a soma da N-ésima diagonal do Triângulo de Pascal.
// Como essa soma pode ser um valor muito alto, imprimir apenas o resto dessa soma por 10^9 + 7.

#include <bits/stdc++.h>

#define MOD 1000000007

using namespace std;

int fibDynamicProgramming(int n, vector<int>& memo) {
    
   if(memo[n] == -1) {
       memo[n] = (fibDynamicProgramming(n-1, memo) + fibDynamicProgramming(n-2, memo)) % MOD;
   }
   
   return memo[n];
}

int main() {
    int n;
    cin >> n;
    
    vector<int> dp(n+1, -1);
    dp[1] = 1, dp[2] = 1;
    
    cout << fibDynamicProgramming(n, dp) << endl;

    return 0;
}