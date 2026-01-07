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
   count=0
   while [ "$count" -le "$N" ]
   do
   
   read line
   
   char=$(echo "$line" | cut -f1-3) #f1 denotes the field 1 to 3 (cut -c13-) from 13 to end
   
   echo "$char"
   
   ((count++))
   done
        
}

CheckingNValue