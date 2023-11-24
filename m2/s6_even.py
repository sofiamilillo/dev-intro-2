"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From a flow chart to code: print only the even numbers in an array
"""

# a list of integers
data = [1, 42, 13, 3, 45, 2]

"""
 This code almost doesn't look Python
 The idea is following brainlessly the related flowchart
 We'll see how to rewrite it in a more idiomatic way
"""
if len(data) == 0:
    print("Done")
else:
    i = 0

    while True:
        # check if the current value in the array is even
        if data[i] % 2 == 0:
            print(data[i])

        # check if it is the last element
        if i == len(data) - 1:
            break
        i = i + 1

    print("Done")
