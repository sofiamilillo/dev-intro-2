"""
 Introduction to Software Development (Python)

 https://github.com/egalli64/dev-intro

 An example of Functional Programming
"""

data = ["hello", "welcome", "hi", "goodbye", "ciao"]

print("Original data:", data)

# This call to sort() is not very interesting
data.sort()
print("Natural sorted:", data)

# Using sort() as a High Order Function
# a function is passed to sort as "key"
# it tells to sort _how_ it should map each element when sorting it
data.sort(key=len)
print("Sorted by length:", data)

values = [10, 12, 33]

# imperative approach to get the sum
result = 0
for value in values:
    result += value
print(values, "sum is", result)


def recursiveSum(a, i, accumulator):
    """
    recursive approach, typically preferred in functional programming
    Python has no Tail Call Optimization (TCO)
    so, you won't see often code like that in Python production code
    """
    if i == len(a):
        return accumulator
    else:
        return recursiveSum(a, i + 1, accumulator + a[i])


def sumRec(a, i, acc):
    """same as recursiveSum(), but more compact"""
    return acc if i == len(a) else sumRec(a, i + 1, acc + a[i])


def sum(a):
    """hide the internal details to the user"""
    return sumRec(a, 0, 0)


print(values, "sum is", sum(values))
