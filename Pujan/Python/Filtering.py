import pandas as pd
import numpy as np
roes=10
col=3
df=pd.DataFrame(np.random.randint(1,100, size=(roes,col)), columns=['A','B','C'])
print(df)
filtered_df=df[df['B']>50]
print(f"Filtered Df: {filtered_df}")