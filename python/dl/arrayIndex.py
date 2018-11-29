import numpy as np

results = np.zeros((1, 30))
seq = [1, 14, 22]
results[0, seq] = 1
print results[0, seq]
results[0, [2, 4, 6, 8]] = 1
seq = [2, 4, 6, 8]
print results[0, seq]
nda = results[0, seq]
print nda