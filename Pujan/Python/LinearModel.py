import numpy as np
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

# Data (Age Group: 1 = 18-29, 2 = 29-40, 3 = 40+)
x = [2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,3]
y = [10,70,10,30,10,10,10,10,10,10,10,70,10,50,70,10,10,30,10,30]

# Reshaping x to be a 2D array as required by the model
X = np.array(x).reshape(-1, 1)
Y = np.array(y)

# Create and fit the model
model = LinearRegression()
model.fit(X, Y)

# Get the coefficients and intercept
slope = model.coef_[0]
intercept = model.intercept_

# Print the results
print(f"Slope (Coefficient): {slope}")
print(f"Intercept: {intercept}")

# Predict values using the model
y_pred = model.predict(X)

# Plot the results
plt.scatter(x, y, color='blue', label='Actual Data')
plt.plot(x, y_pred, color='red', label='Linear Regression Line')
plt.xlabel('Age Group')
plt.ylabel('Proportion of Internet Usage in Video Games (%)')
plt.title('Linear Regression: Age Group vs Internet Usage in Video Games')
plt.legend()
plt.show()
