import numpy as np
p = float(input())
x = 1.5 * np.log2((p/1.5)*np.log(2))
t = x + p/(2**(x/1.5))
print(t)