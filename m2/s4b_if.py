"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 Decision by if-elif-else
"""
a = 7
b = 3
print("a is", a)
print("b is", b)

# if
if a < b:
    print("a is less than b")


# if - else
if a == b:
    print("a is equal to b")
else:
    print("a is not equal to b")

# if - elif
if a > b:
    print("a is bigger than b")
elif b > a:
    print("b is bigger than a")

# if - elif - else
if a > b:
    print("a is bigger than b")
elif b > a:
    print("b is bigger than a")
else:
    print("a is equal to b")
