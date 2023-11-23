"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 Jumping to the next iteration in a loop with continue
"""

for i in range(20):
    print("[", end="")
    if i < 3 or i > 16:
        print(" ? ] ", end="")
        continue
    print(str(i) + "] ", end="")

print()
