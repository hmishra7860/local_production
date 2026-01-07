names = ["john smith", "jay santi", "eva kuki"]

names = [name.title() for name in names]

print(names)


# ==========================================================================


usernames = ["john 1990", "alberta1970", "magnola2000"]

usernames = [(len(username)) for username in usernames]

print(usernames)

# ==========================================================================

user_entries = ['10', '19.1', '20']

user_entries = [float(user_entry) for user_entry in user_entries]

print(user_entries)

# ==========================================================================

user_entries = ['10', '19.1', '20']

user_entries = [float(entries) for entries in user_entries]

print(sum(user_entries))

# ==========================================================================

temperatures = [10, 12, 14]
temperatures = [str(i) + '\n' for i in temperatures]
file = open("file.txt", 'w')

file.writelines(temperatures)



# ==========================================================================

languages = ['English', 'German', 'Spanish']

for language in languages:
    with open(f"{language}.txt", 'w') as file:
        file.write(f"{language}")


# ==========================================================================


filenames = ["report.txt", "downloads.txt", "success.txt", "folders.txt"]

for filename in filenames:
    without_format = filename.find('.')
    name = filename[:without_format]
    print(name)



# ==========================================================================


try:
    total_value = float(input("Enter total value: "))
    value = float(input("Enter value: "))

    percent = (value/total_value)*100

    print(f"That is {percent}%")

except ValueError:
    print('Total Value cannot be zero.')


# ==========================================================================



def format_filename():
    filename = "report.txt"
    name = filename.find(".")
    text = filename[:name]
    text_last = text.capitalize()
    return text_last
    
    
print(format_filename())


# ==========================================================================


def strength(password):
    UpperCase = any(i.isupper() for i in password)
    lowercase = any(i.islower() for i in password)
    if len(password) > 8 and UpperCase and lowercase:
        return "Strong Password"
    else:
        return "Weak Password"
    
print(strength("JKFJRBEJBEK123q"))



# ==========================================================================



def Average(list_file):
    
    total_score = (sum(list_file)/len(list_file))
    
    return total_score
    
ls = [10, 20, 30, 40]

print(Average(ls))


    
    