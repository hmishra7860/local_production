def Average(list_file):
    
    total_score = (sum(list_file)/len(list_file))
    
    return total_score
    
ls = [10, 20, 30, 40]

print(Average(ls))