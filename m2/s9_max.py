"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From flow chart / pseudo-code to code: max value in a list
"""

a = [12, 3, -10, 0, 50, 15]

max = a[0]

for cur in a:
    if cur > max:
        max = cur

print("The biggest value is:", max)
