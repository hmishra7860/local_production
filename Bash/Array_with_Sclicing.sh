#!/bin/bash 

#We now transition to some basic examples of bash scripting for the purpose of text processing and data munging. In this challenge, we practice reading and filtering an array. Resources

ReadArry(){
        count=0
        while read -r line
        do
        my_array[count]="$line"
        
        ((count++))
        done
        
}
DisplayArry(){
    filtered_arr=()
    for element in "${my_array[@]}";
    do
    [[ "${element}" =~ [aA] ]] ||  filtered_arr+=("${element}")
    done
    echo ${filtered_arr[@]}
}
ReadArry
DisplayArry