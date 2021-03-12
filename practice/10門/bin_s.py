def age():
    r = 1
    l = 100
    mid = 0
    while l-r > 1:
        print(r,l)
        mid = int((r+l)/2)
        ans = input(f"{mid}歳より上? (y/n)")
        if ans == "y":
            r = mid
        else:
            l = mid
    print(l)

def pair_sum():
    from bisect import bisect_left, bisect_right

    a = [1,2,3,4,5,6,20]
    b = [6,7,8,9,10,11,15,17]
    K = 19
    mi_ = 100000
    for i in range(len(a)):
        idx = bisect_left(b,K - a[i])
        mi_ = min(mi_, a[i] + b[idx])
    print(mi_)
pair_sum()