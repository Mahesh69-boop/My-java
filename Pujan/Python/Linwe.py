import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import pandas as pd

# Data
X = np.array([7, 5, 5, 5, 5, 5, 3, 3, 3, 5, 9, 5, 7, 5, 9, 3, 5, 5, 5, 3]).reshape(-1, 1)
Y = np.array([10, 70, 10, 30, 10, 10, 10, 10, 10, 10, 10, 70, 10, 50, 70, 10, 10, 30, 10, 30])

# Create a Linear Regression model
model = LinearRegression()
model.fit(X, Y)

# Predictions
y_pred = model.predict(X)

# Visualizing the Linear Regression model
plt.scatter(X, Y, color='blue')  # Scatter plot of the data points
plt.plot(X, y_pred, color='red')  # Regression line
plt.title('Linear Regression: Daily Internet Usage vs Proportional Gaming')
plt.xlabel('Daily Internet Usage (hrs)')
plt.ylabel('Proportional Gaming (%)')
plt.show()

# Save predictions and data for MATLAB visualization
data = pd.DataFrame({'X': X.flatten(), 'Y': Y, 'Prediction': y_pred})
data.to_csv('regression_data.csv', index=False)
