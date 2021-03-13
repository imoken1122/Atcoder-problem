from collections import deque
def BFS(G,s): #探索の始点 s
    n = len(G)
    dist = [-1]*n # dist[idx] : 始点sからidx番ノードの最短距離
    dist[0] = s
    que = deque()
    que.append(s) 

    while que:
        v = que.popleft()

        for x in G[v]:
            if dist[x] != -1: continue

            dist[x] = dist[v] + 1 #この距離は問題による 
            que.append(x)
    return dist

def main():
    n,m = list(map(int,input().split()))

    G = [[] for i in range(n)]
    for i in range(m):
        a,b = list(map(int,input().split()))
        G[a-1].append(b-1)
        G[b-1].append(a-1)
    print(G)
    dist = BFS(G,0)
    print(dist)
main()