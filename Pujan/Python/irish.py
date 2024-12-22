from sklearn.datasets import load_iris

# Load the iris dataset
iris = load_iris()

# Get the feature data (X)
X = iris.data

# Get the target data (y)
y = iris.target

# Get feature names
feature_names = iris.feature_names

# Get target names (species of flowers)
target_names = iris.target_names

# Display the first 5 samples
print("Feature data (first 5 samples):\n", X[:5])
print("\nTarget data (first 5 labels):", y[:5])
print("\nFeature names:", feature_names)
print("\nTarget names (species):", target_names)
