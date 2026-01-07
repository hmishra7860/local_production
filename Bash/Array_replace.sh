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
    new_Array=$(echo "${my_array[@]/[A-Z]/.}") #we practice reading and transforming arrays.
    echo $new_Array
}
ReadArry
DisplayArry
