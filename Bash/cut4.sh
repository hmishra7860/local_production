#!/bin/bash


N=100

CheckingNValue(){
    
  if [ "$N" -le 100 ] && [ "$N" -ge 1 ]; then
  CuttingtheWord
  else
  echo "Enter the Value Between 1-to-100"  
  fi
}
CuttingtheWord(){
   while read lines 
do 
    echo $lines | cut -d " " -f 4
done
        
}

CheckingNValue
