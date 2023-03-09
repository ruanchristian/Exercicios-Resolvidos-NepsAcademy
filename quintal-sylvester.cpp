#include <bits/stdc++.h>

const long long MOD = 1e9 + 7;

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int N, M, P, X, Y;
    cin >> N >> M >> P;
    
    int dp[M+2][N+2], pairs[M+2][N+2];
    memset(dp, 0, sizeof dp);
    memset(pairs, 0, sizeof pairs);
    
    while (P--) {
        cin >> X >> Y;
        pairs[X][Y]=1;
    }
    
    dp[0][1]=1;
    
    for (int i=1; i<=M; ++i) {
        for (int j=1; j<=N; ++j) {
            if (pairs[i][j]) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%MOD;
            }
        }
    }
    cout << dp[M][N] << endl;
    
    return 0;
}