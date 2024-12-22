import pandas as pd
import numpy as np
from sklearn.datasets import fetch_california_housing
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression, Ridge, Lasso
from sklearn.preprocessing import StandardScaler
from sklearn.metrics import mean_squared_error, r2_score
data=fetch_california_housing()
df=pd.DataFrame(data=data.data, columns=data.feature_names)
df['MedHouseVal']= data.target
print(df.head())
print(df.info())
print(df.describe())
print(df.isnull().sum())
X=df.drop(columns=['MedHouseVal'])
y=df['MedHouseVal']
scalar= StandardScaler()
X_scaled=scalar.fit_transform(X)
print(X_scaled)
X_train, X_test, y_train, y_test = train_test_split(X_scaled, y, test_size=0.2, random_state=42)

print(f"Training data size: {X_train.shape[0]} samples")
print(f"Testing data size: {X_test.shape[0]} samples")
# Initialize the Linear Regression model
lr_model = LinearRegression()

# Train the model
lr_model.fit(X_train, y_train)

# Make predictions on the test set
y_pred_lr = lr_model.predict(X_test)

# Print the predicted values along with corresponding features
for i, (features, predicted_value) in enumerate(zip(X_test, y_pred_lr)):
    print(f"Test instance {i+1}: Features = {features}, Predicted Value = {predicted_value}")



# Evaluate the model
print("\nLinear Regression Model Evaluation:")
print(f"Mean Squared Error: {mean_squared_error(y_test, y_pred_lr)}")
print(f"R² Score: {r2_score(y_test, y_pred_lr)}")

# Plot Actual vs. Predicted values for Linear Regression
plt.figure(figsize=(8, 6))
plt.scatter(y_test, y_pred_lr, alpha=0.5)
plt.plot([y_test.min(), y_test.max()], [y_test.min(), y_test.max()], 'k--', lw=2)
plt.xlabel('Actual Prices')
plt.ylabel('Predicted Prices')
plt.title('Linear Regression: Actual vs Predicted Prices')
plt.show()

