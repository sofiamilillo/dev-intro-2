"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 Bubble sort - most basic implementation
"""

data = [4, 5, 1, 8, 2]
print("The list:", data)

# repeat n-1 times
for i in range(len(data) - 1):
    # compare the neighbors, and swap if required
    for j in range(len(data) - 1):
        if data[j] > data[j+1]:
            print(f"Swap between {data[j]} and {data[j+1]}")
            data[j], data[j+1] = data[j+1], data[j]
        print(f"The list (iteration {i}-{j}): {data}")

print("The sorted list:", data)
