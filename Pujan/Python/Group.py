import pandas as pd
data={
    'Depertment':['IT','HR','IT','HR','IT','IT','HR'],
    'Employee':['Mahesh','Mahesh','Pujan','Puja','Parbat','Raju','Sabitra'],
    'Salary':[230000,28000,456000,12908,2638482,9238499,37575884]
}
df=pd.DataFrame(data)
print(df)
Grouped=df.groupby('Depertment')['Salary'].sum()
print(Grouped)
Average_salary=df.groupby('Depertment')['Salary'].mean()
print(f"The mean salary of each department is{Average_salary}")