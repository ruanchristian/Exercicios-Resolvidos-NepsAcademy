// Na versão CCC do Rövarspråket, cada consoante é substituída por três letras, na seguinte ordem:
// a própria consoante;
// a vogal mais próxima da consoante no alfabeto (por exemplo, se a consoante for d, então a vogal mais próxima é e), com a regra de que se a consoante cair exatamente entre duas vogais, então a vogal mais próxima do início do alfabeto será escolhida (por exemplo, se a consoante for c, então a vogal mais próxima é a);
// a próxima consoante no alfabeto seguindo a consoante original (por exemplo, se a consoante for d, então a consoante seguinte é f) exceto se a consoante original for z, neste caso a consoante seguinte também é z.
// As vogais na palavra permanecem as mesmas. (As vogais são a, e, i, o, u e todas as outras letras são consoantes).

// Objetivo: escrever um programa que traduz uma palavra do inglês para Rövarspråket.

#include <bits/stdc++.h>

using namespace std;

const char vogais[] = {'a', 'e', 'i', 'o', 'u'};
const char consoant[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

bool isVowel(char s) {
    for (int i=0; i < 5; i++) {
        if(s==vogais[i]) return true;
    }
    return false;
}

char nextConsoant(char c) {
    if (c=='z') return 'z';
    
    char consoant = c + 1;
    
    if(isVowel(consoant)) consoant++;
    
    return consoant;
}

string closestVowel(char c) {
    int maxDiff=123456;
    string closest;
    
    for (int i=0; i<5; i++) {
        int cDiff = abs(vogais[i] - c);
        if (cDiff < maxDiff) {
            maxDiff=cDiff;
            closest=vogais[i];
        }
    }
    return closest;
}

int main() {
    string word, rovarspraket;
    cin >> word;
    
    for (int i=0; i<word.length(); i++) {
         if(!isVowel(word[i])) {
             rovarspraket += word[i] + closestVowel(word[i]) + nextConsoant(word[i]);
          } else rovarspraket += word[i];
      }
     
    cout << rovarspraket;
    
    return 0;
}
