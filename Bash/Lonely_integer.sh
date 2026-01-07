#!/bin/bash

# Read the number of elements (not strictly needed for logic)
read n

# Read the array elements into a Bash array
read -a arr

# Initialize result variable
result=0

# XOR all elements
for num in "${arr[@]}"; do
  result=$((result ^ num))
done

# Output the lonely integer
echo "$result"



#arr = (1 1 2 2 3)
#result = 0 ^ 1 ^ 1 ^ 2 ^ 2 ^ 3 = 3

