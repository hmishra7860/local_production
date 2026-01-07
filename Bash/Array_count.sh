#!/bin/bash 

ReadArry(){
        count=0
        while read -r line
        do
        my_array[count]="$line"
        
        ((count++))
        done
        
}
DisplayArry(){
    echo "${#my_array[@]}"  #Display element at 3
}
ReadArry
DisplayArry

# ${#my_array[@]} gives the count of elements in the array.

# ${my_array[@]} gives all elements.

# ${my_array[0]} accesses a specific element.