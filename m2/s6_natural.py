"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From a flow chart to code: print the natural numbers in 1 .. n (provided by the user)
"""

n = int(input("Pass me a (small) natural number: "))

i = 1
while i <= n:
    print(i)
    i += 1
