field = None
W,H = None,None
def dfs(h,w):
    #探索済みは 0 にする
    field[h][w] = 0
    #八方を探索
    for i in range(-1,2):
        for j in range(-1,2):
            nh = h + i
            nw = w + j
            if nh < 0 or nh >= H or nw < 0 or nw >= W: continue
            if field[nh][nw] == 0: continue
            dfs(nh,nw)


while True:
    W,H = list(map(int,input().split()))
    if W == 0 and H == 0: break
    field = [list(map(int,input().split())) for i in range(H)]
    cnt = 0

    #隣接する陸は1つの島扱いなので count += 1 して, 隣接するマスは全て 0 にする
    for h in range(H):
        for w in range(W):
            if field[h][w] == 0: continue
            dfs(h,w)
            cnt += 1
    print(cnt)