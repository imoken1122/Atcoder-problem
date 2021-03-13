seen = None
def DFS(G,v):
    seen[v] = True
    for next_v in G[v]:
        if seen[next_v]: continue
        DFS(G,next_v)
        
def main():
    n,m = list(map(int,input().split()))
    n += 1
    G = [[] for i in range(n)]
    for i in range(m):
        a,b = list(map(int,input().split()))
        G[a].append(b)
    print(G)
    seen = [False] * (n)
    for v in range(1,n):
        if seen[v] :continue
        DFS(G,v)
    print(seen)