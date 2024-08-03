"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From flow chart / pseudo-code to code: sum of values in a list
"""

data = [1, 42, 13, 3, 45, 2]

result = 0
for cur in data:
    result += cur

print("Sum of data is", result)
