import sys
sys.setrecursionlimit(10**6)
m = int(input())
n = int(input())
field = [list(map(int,input().split())) for i in range(n)]
#seen = [[False]*21 for i in range(21)]
cnt = 0
l = []
dx=[1,0,-1,0]
dy = [0,1,0,-1]

def dfs(h,w, tmp):
    global cnt
    #seen[h][w] = True
    cnt = max(cnt,tmp)
    for i in range(4):
        nh =  h + dx[i]
        nw = w + dy[i]
        if nh < 0 or nh >= n or nw < 0 or nw >= m: continue
       # if seen[nh][nw] : continue
        if field[nh][nw] == 0 : continue
        field[nh][nw] = 0
        dfs(nh,nw,tmp+1)
        field[nh][nw] =1 


for h in range(n):
    for w in range(m):
        #if seen[h][w] :continue
        if field[h][w] == 0: continue
        field[h][w] = 0
        dfs(h,w,1)
        field[h][w] = 1
print(cnt)
    
