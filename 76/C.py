import re
 
S = input().replace('?', '.')
T = input()
 
ans = []
 
for i in range(len(S)-len(T), -1, -1):
    print(i)
    if re.match(S[i:i+len(T)], T):
        ans.append((S[:i] + T + S[i+len(T):]).replace('.', 'a'))
print(ans)
print(min(ans) if ans else 'UNRESTORABLE')
