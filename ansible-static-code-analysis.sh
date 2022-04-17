#!/bin/bash 

echo $PWD

for file in * ; do 
     if [ -d $file ]
     then 
        echo "This is a directory"
     else 
       if [ "${file: -5}" == ".yaml" ]
     then
        echo "yaml file is found" 
        pwd
        yq $file
  fi
fi
done;
