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
        for ((i=0;i<${#my_array[@]};i++))
        do
        echo ${my_array[$i]}
        done
}

ReadArry
DisplayArry