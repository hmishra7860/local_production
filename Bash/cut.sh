#!/bin/bash


N=16

CheckingNValue(){
    
  if [ "$N" -le 100 ] && [ "$N" -ge 1 ]; then
  CuttingtheWord
  else
  echo "Enter the Value Between 1-to-100"  
  fi
}
CuttingtheWord(){
    
    count=0
    
    while [ "$count" -le "$N" ]
    do
    read -r line
    
    char2=$(echo "$line" | cut -c2)
    char7=$(echo "$line" | cut -c7)
    
    echo "$char2$char7"
    ((count++))
    done
    
}

CheckingNValue
