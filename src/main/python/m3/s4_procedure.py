"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 An example of Procedural Programming
"""

# a global variable - accessible by all the procedures!
count = 0


def triple(base):
    global count

    count += 1
    return base * 3


def caller():
    value = 12
    result = triple(value)
    print(value, "--->", result)


def f():
    global count

    count = triple(27)
    print(count)


def hello():
    global count

    print("Hello! ...", count)


hello()
f()
caller()
hello()