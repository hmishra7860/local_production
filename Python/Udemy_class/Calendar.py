def is_leap(year):
    # A leap year is divisible by 4
    # But not divisible by 100, unless also divisible by 400
    return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

# Input from user
year = int(input("Enter a year: "))

# Output result
if is_leap(year):
    print(f"{year} is a Leap Year.")
else:
    print(f"{year} is NOT a Leap Year.")


#============================================================================================================#

#Another way to write python Program:
def is_leap(year):
    
    
    # Write your logic here
    if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        return True
    else:
        return False
        
        

year = int(input())
print(is_leap(year))
