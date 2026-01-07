#!/bin/bash


N=15

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
   
   char=$(echo "$line" | cut -c2-7) #(cut -c0-4) from Starting to 4th Place
   
   echo "$char"
   
   ((count++))
   done
        
}

CheckingNValue