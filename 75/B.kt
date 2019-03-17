#include <iostream>
#include <string> 
using namespace std;
int main(void) {
    int H,W,cnt = 0;
    cin >> H >> W;
    string A[H];
    for(int i = 0;i<H;i++) cin >> A[i];
    
    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            cnt = 0;
            if(A[i][j] == '#') continue;
            for(int r=-1;r<=1;r++){
                if(r+i<0 || H<=r+i) continue;
                for(int c = -1 ;c<=1;c++){
                    if(c + j <0 || c+j >= W) continue;
                    if(c == 0 && r == 0) continue;
                    if(A[i + r][c + j] == '#') cnt++ ;
                }
            }
            A[i][j] = to_string(cnt)[0];
        }
    }
     for (int i = 0; i < H; i++) cout << A[i] << endl;
	
}

