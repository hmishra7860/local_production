#!/bin/bash


CuttingtheWord(){
        
   while read lines 
do 
    echo "$lines" >> file.txt
    
done
      head -n 20 file.txt  # use -c for printing first 20 bytes 
}

CuttingtheWord
