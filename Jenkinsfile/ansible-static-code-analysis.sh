#!/bin/bash 

echo $PWD

for file in ${WORKSPACE}/*.yaml ; do 
        yq $file
done;
