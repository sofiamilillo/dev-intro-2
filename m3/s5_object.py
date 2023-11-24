"""
 Introduction to Software Development (Python)
 
 https://github.com/egalli64/dev-intro

 An example of Object Oriented Programming
"""


class Pet:
    def __init__(self, name):
        # the leading '_' is gently suggesting not to use the attribute outside the class
        self._name = name
        self._weight = 5.0

    def eat(self):
        self._weight += 0.1
        print(self._name, "is eating, now is weight is", self._weight)

    def __str__(self):
        return "[" + self._name + ", " + str(self._weight) + "]"


# Create an object of Pet type
bob = Pet("Bob")
print(bob)

# Interact with an object calling its methods
bob.eat()
