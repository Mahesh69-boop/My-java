import numpy as np
a= np.array([[1,2,3],[8,9,10],[40,34,20]])
print("Original array:" + str(a))
a[a%2==0]= -1
print("Modifie array" + str(a))
mean= np.mean(a)
median=np.median(a)
St_deviation=np.std(a)
print("mean :" + str(mean) +"\nmedian: " + str(median) +"\nStandard deviation: " + str(St_deviation))