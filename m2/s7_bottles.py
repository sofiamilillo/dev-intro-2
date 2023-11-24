"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From a flow chart to code: buy n or 6 bottles of milk
"""

n = 1

check = input("Are there 6 fresh eggs? [y/n]: ")
if check == "y":
    n = 6

print("Buy", n, "milk bottle(s)")
