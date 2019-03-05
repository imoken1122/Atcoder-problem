#include <iostream>
using namespace std;
int array[9];
int func(int x){
    int idx;
    if(1<=x && x<= 399) idx = 0;
    else if(400<=x && x <= 799) idx = 1;
    else if(800<=x && x <= 1199) idx = 2;
    else if(1200<=x && x <= 1599) idx = 3;
    else if(1600<=x && x <= 1999) idx = 4;
    else if(2000<=x && x <= 2399) idx = 5;
    else if(2400<=x && x <= 2799) idx = 6;
    else if(2800<=x && x <= 3199) idx = 7;
    else idx = 8;
    return idx;
}
int main(void){
    int n,x,kind=0;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> x;
        int index = func(x);
        array[index]++;
    }
    for(int i=0;i<8;i++) if(array[i] > 0) kind++;
    if(kind == 0) cout<<1<<" "<<array[8];
    else cout<<kind<<" "<< kind + array[8];
}
    

