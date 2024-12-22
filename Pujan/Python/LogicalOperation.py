import numpy as np
Array= np.random.randint(0,100, size=15)
list=np.where(Array>50)
print(Array)
print(list[0])