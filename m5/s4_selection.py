"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 Selection sort - most basic implementation
"""

data = [4, 5, 1, 8, 2]
print("The list:", data)

# for each position (but the last one)
for i in range(len(data) - 1):
    # find the position of the smallest element to the right
    pos = i
    for j in range(i+1, len(data)):
        if data[j] < data[pos]:
            pos = j

    # swap current and minimal elements
    print(f"Swap between {data[i]} and {data[pos]}")
    data[i], data[pos] = data[pos], data[i]

print("The sorted list:", data)
