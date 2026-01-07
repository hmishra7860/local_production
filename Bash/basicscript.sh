#!/bin/bash

Average(){
N=3

if [ $N -lt 100 ] && [ $N -gt 1 ]; then
for (( i=1; i<=N; i++ )); do
    read line  # Read the input line
    echo "${line:2:1}"  # Print the 3rd character (index starts from 0, so 2 represents the 3rd character)
done
else
echo "Put correct integer value: "
fi
}

Average

