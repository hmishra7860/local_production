students = []

N = int(input())
 
        
for _ in range(N):
    name = input()
    score = float(input())
    students.append([name, score])
    
grades = sorted(set(score for name, score in students))

second_lowest = grades[1]

result = sorted([name for name, score in students if score == second_lowest])

for name in result:
    print(name)
        
        
        
