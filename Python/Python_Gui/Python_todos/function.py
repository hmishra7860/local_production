import os
FILEPATH = "to_do_s.txt"


if not os.path.exists(FILEPATH):
    with open(FILEPATH, 'w') as f:
        f.write("New File Created.\n")
else:
    print("file already exists.")


def get_todos(filepath=FILEPATH):
    with open(filepath, 'r') as file_local:
        todos_local = file_local.readline()
    return todos_local

def write_todos(todos_arg, filepath=FILEPATH):
    with open(filepath, 'w') as file:
        file.writelines()


if __name__ == "__main__":
    print(get_todos())
   
