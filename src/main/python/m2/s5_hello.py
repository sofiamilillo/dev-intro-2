"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From a flow chart to code: say hello to the user
"""

name = input("What's your name? ")

message = "Hello, "

if name == "Tom":
    message += name
else:
    message += "stranger"

print(message)
