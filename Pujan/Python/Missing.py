import pandas as pd
import numpy as np
data={
    'name':[8,9,10],
    'Age':[4,np.nan,24],
    'pace':[7,np.nan, 3],
    'Kas':[np.nan,np.nan,np.nan]
}
df=pd.DataFrame(data)
print(df)
df['Age']=df['Age'].fillna(df['Age'].mean())
df['pace']=df['pace'].fillna(df['pace'].mean())
df['Kas']=df['Kas'].fillna(df['Kas'].mean())
print(df)
