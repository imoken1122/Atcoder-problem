H,W = list(map(int,input().split()))
field = [input() for i in range(H)]
dx = [1,0,-1,0]
dy = [0,1,0,-1]
seen = [[False for _ in range(510)] for _ in range(510)]


def dfs(h,w):
    seen[h][w] = True
    for i in range(4):
        nh = h + dx[i]
        nw = w + dy[i] 

        if nh < 0 or nh >= H or nw < 0 or nw >= W: continue
        if field[nh][nw] == "#": continue
        if seen[nh][nw]: continue
        dfs(nh,nw) 

sh,sw,gh,gw = 0,0,0,0
for h in range(H):
    for w in range(W):
        if field[h][w] == "s":
            sh,sw = h,w 
        if field[h][w] == "g":
            gh, gw = h,w

dfs(sh,sw)

if seen[gh][gw]:
    print("Yes")
else:
    print("No")