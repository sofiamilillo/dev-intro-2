"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 From flow chart / pseudo-code to code: is a palindrome?
"""

s = "abba"

isPal = True

for i in range(len(s) // 2):
    if s[i] != s[-(i+1)]:
        isPal = False
        break

print(s, "is a palindrome?", isPal)
