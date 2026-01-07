#Given a sentence, identify and display its first three words. Assume that the space (' ') is the only delimiter between words.

#Input Format

#A text file with lines of ASCII text only. Each line has exactly one sentence.

#!/bin/bash


CuttingtheWord(){
        
   while read lines 
do 
    echo $lines | cut -d " " -f0-3
done
        
}

CuttingtheWord
