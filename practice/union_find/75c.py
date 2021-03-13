n,m = list(map(int,input().split()))
ab = [list(map(int,input().split())) for i in range(m)]

from unionfind import UnionFind

ans = 0
for i in range(m):
    uf = UnionFind(n)
    for j,abi in enumerate(ab):
        # ai,biの辺を除いたグラフでunionfindを構築
        if j ==i : continue
        a,b = abi
        uf.unite(a,b)
    a,b = ab[i]
    # ai,bi 間の辺を除いた状態で ai,biは同じグループか?(親は存在するか）
    # 親がいなければ, 非連結 -> ai,bi間のへんしか存在しないことになる
    if not uf.issame(a,b):
        ans += 1
print(ans)