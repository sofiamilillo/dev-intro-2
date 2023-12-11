"""
Introduction to Software Development (Python)
 
https://github.com/egalli64/dev-intro

Using an external package, the adder provided by zxing https://pypi.org/user/zxing/

1) Better if working in a virtual environment!
2) pip install example2023 _or_ pip install -r requirements.txt
3) inspect the code, installed in the Lib environment folder
4) Check if the call to add works alright
5) pip uninstall example2023 _or_ uninstall -y -r requirements.txt
"""
import example2023.math as ex

print(ex.add(3, 4))
