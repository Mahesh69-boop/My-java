from sklearn.model_selection import train_test_split
import kagglehub
path = kagglehub.dataset_download("ziya07/fever-diagnosis-and-medicine-dataset")
print("Path to dataset files:", path)
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
X = [[1], [2], [3], [4], [5]]  
y = [0, 1, 0, 1, 0]           

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.4, random_state=None)
model=LinearRegression()
model.fit(X_train,y_train)
Y_pred=model.predict(X_test)
mse=mean_squared_error(y_test,Y_pred)
r2 = r2_score(y_test, Y_pred)
print("Training set:", X_train, y_train)
print("Testing set:", X_test, y_test)
print("Mean square Error:", mse)
print("R score", r2)