#!/bin/bash


CuttingtheWord(){
        
   while read lines 
do 
    echo "$lines" >> file.txt
    
done
      sed -n '12,22p' file.txt  # Print text from 12 line 22th line
}

CuttingtheWord
