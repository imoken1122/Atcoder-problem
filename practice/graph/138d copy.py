import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,q = list(map(int,input().split()))
G = [[] for i in range(n)]
for i in range(n-1):
    a,b = list(map(int,input().split()))
    a,b = a-1,b-1
    G[a].append(b)
    G[b].append(a)
px = [0]*n
for i in range(q):
    p,x = list(map(int,input().split()))
    px[p-1] += x

def dfs(v,p):

    if p == -1 : px[v] += px[]
    for next_v in G[v]: 
        if next_v == p: continue
        dfs(next_v,v)

if __name__ == '__main__':
    dfs(0,-1)
    print(*px)