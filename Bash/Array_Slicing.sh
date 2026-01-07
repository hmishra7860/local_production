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
    echo "${my_array[@]:3:5}"  
}
ReadArry
#DisplayArry