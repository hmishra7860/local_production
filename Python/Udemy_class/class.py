password = input("Enter the password! ")

if len(password) > 7:
    print("Great password there!")
elif len(password) == 7:
    print("Password is OK")
else:
    print("Your password is weak")
    