import sys
sys.setrecursionlimit(10**6)
n,q = list(map(int,input().split()))
ab = [list(map(lambda x: int(x)-1,input().split())) for i in range(n-1)]
px ={} 
for i in range(q):
    p,x = list(map(int,input().split()))
    p -= 1
    if p not in px.keys():
        px[p] = []
    px[p].append(x)

score = [0] * n
seen = [False] * n
G = [[] for i in range(n)]
for a,b in ab:
    G[a].append(b)
    G[b].append(a)
s = 0 

def dfs(G,v,s):
    seen[v] = True
    if v in px.keys(): 
        score[v] += s+sum(px[v])
    else:
        score[v] += s

    for next_v in G[v]: 
        if seen[next_v]: continue
        dfs(G,next_v, score[v])


dfs(G,0,s)
print(*score)