import pandas as pd
import numpy as np
data= {
    "Name" : ["mahesh","Pujan","Parbat","Puja","Raju"],
    "Age":[19,19,24,26,47],
    "city":["Surkhet","Kathmandu","Los Angeles","Pokhara","Nw york"],
    "Salary":[12000,14000,16500,300000, 450000]
}
df=pd.DataFrame(data)
print(df)
df["Bonous"]=df["Salary"]*0.15
print(df)
Average_age=np.mean(df["Age"])
Average_salary=np.mean(df["Salary"])
print(f"Average Age is: {Average_age}")
print(f"Average_salary is: {Average_salary}")
