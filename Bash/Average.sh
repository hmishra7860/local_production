#!/bin/bash



Cutt(){
    
    read N

    # Validate that N is within the correct range (1 to 100)
    if [ $N -ge 1 ] && [ $N -le 100 ]; then
       Evaluation  # Call the Evaluation function
    else
     echo "Invalid number. Please enter a valid number between 1 and 100."
        
    fi
}

Evaluation(){
    count=0

    # Loop to read $N lines of input
    while [ $count -lt $N ]
    do
        read -r line  # Read each input line
        #echo "Debug: You entered -> '$line'"
        echo "${line:2:1}"  # Print the 3rd character from each line
        ((count++))  # Increment count
    done
}

Cutt


