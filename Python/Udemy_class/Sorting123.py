# Enter your code here. Read input from STDIN. Print output to STDOUT

def custom_sort(S):
    lower = sorted([c for c in S if c.islower()])
    upper = sorted([c for c in S if c.isupper()])
    odd_digits  = sorted([ch for ch in S if ch.isdigit() and int(ch) % 2 == 1])
    even_digits = sorted([ch for ch in S if ch.isdigit() and int(ch) % 2 == 0])
        
    return ''.join(lower + upper + odd_digits + even_digits)
        
S = input()
print(custom_sort(S))