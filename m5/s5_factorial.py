"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 Factorial - recursive and iterative algorithm
"""


def factRecursive(n):
    """recursive: elegant but stack bounded"""
    if n < 2:
        return 1
    return n * factRecursive(n-1)


def factTailRecursive(n):
    """tail recursive: preferred where TCO is available"""
    return factRecursion(n, 1)


def factRecursion(n, acc):
    """the actual tail recursive code: preferred where TCO is available """
    return acc if n < 2 else factRecursion(n-1, acc * n)


def factIterative(n):
    """iterative: preferred where TCO is not available (as in Python)"""
    result = 1
    for i in range(2, n + 1):
        result *= i
    return result


for i in range(10):
    print(factRecursive(i), end=" ")
print()

for i in range(10):
    print(factTailRecursive(i), end=" ")
print()

for i in range(10):
    print(factIterative(i), end=" ")
print()
