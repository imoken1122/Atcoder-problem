n = int(input())
a = list(map(int,input().split()))
cnt = 0
flag = True
while flag:
    flag2 = True 
    for i in a:
        if i % 2 !=0 :
            flag2 = False
            break
    if flag2:
        a = list(map(lambda x: x/2, a))
        cnt += 1
    else:
        flag = False
print(cnt)