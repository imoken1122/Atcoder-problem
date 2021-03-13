from typing import Union


class UnionFind():
    def __init__(self,n):
        #親ノード番号, indexが要素に対応, par[x] == x -> root
        self.par = [i for i in range(n+1)]

        #木の高さ
        self.rank = [0] * (n + 1)
    
    def root(self,x):
        if self.par[x] == x : return x
        else: 
            self.par[x] = self.root(self.par[x])
            return self.par[x]
    
    def issame(self,x,y):
        return self.root(x) == self.root(y)
    


    def unite(self,x,y):
        #根を取得
        x = self.root(x)
        y = self.root(y)
        if x == y : return False

        #木の高さ(rank)が高い方に低いのをつける
        if self.rank[x] < self.rank[y]:
            self.par[x] = y
        else:
            self.par[y] = x
            if self.rank[x] == self.rank[y]:
                self.rank[x] += 1
def main():
    #連結成分の個数
    uf = UnionFind(7)
    uf.unite(1,2)
    uf.unite(2,3)
    uf.unite(5,6)
    print(uf.par)
    uf.unite(1,6)

    cnt = 0
    for i in range(1,8):
        if uf.root(i) == i: cnt+=1
    print(cnt)

