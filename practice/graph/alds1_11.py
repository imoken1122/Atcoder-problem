n = int(input())
seen = None
t,ft = [0]*n,[0]*n
G = []

def dfs(G,v,fptr):
    seen[v] = True
    fptr += 1
    t[v] += fptr
    for next_v in G[v]: 
        if seen[next_v]: continue
        dfs(G,next_v, fptr)
    fptr += 1
    ft[v] += fptr 

e = [list(map(lambda x: int(x)-1,input().split())) for i in range(n)]
for el in e: 
    
    G.append(el[2:])
seen = [False]*n
fptr = 0
lptr = 0



dfs(G,0,fptr)
for v in range(n):
    print(v, t[v],ft[v])