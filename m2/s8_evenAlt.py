"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From pseudo-code to code: print only the even values in a list
"""

data = [1, 42, 13, 3, 45, 2]

for cur in data:
    if cur % 2 == 0:
        print(cur)
