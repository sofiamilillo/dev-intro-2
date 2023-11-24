"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 Greatest Common Divisor - recursive and iterative algorithm
"""


def gcdRecursive(a, b):
    """recursive"""
    print(a, b)
    return a if b == 0 else gcdRecursive(b, a % b)


def gcdIterative(a, b):
    """iterative"""
    print(a, b)
    while b != 0:
        a, b = b, a % b
        print(a, b)
    return a


x = gcdRecursive(42, 35)
print("GCD:", x)

x = gcdIterative(42, 35)
print("GCD:", x)
