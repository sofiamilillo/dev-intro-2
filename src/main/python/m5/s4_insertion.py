"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 Insertion sort - most basic implementation
"""

data = [4, 5, 1, 8, 2]
print("The list:", data)

# for each position from the second
for i in range(1, len(data)):
    # compare the neighbors to the left, and swap until required
    for j in range(i, 0, -1):
        if data[j] < data[j-1]:
            print(f"Swap between {data[j-1]} and {data[j]}")
            data[j-1], data[j] = data[j], data[j-1]
        else:
            break
    print(f"{i}: the list is {data}")

print("The sorted list:", data)
