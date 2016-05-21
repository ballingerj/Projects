#!/bin/bash
# $1=computerName (ie, alvenv100)
# $2=number of nodes 
rm *.csv
touch received.csv
rm bestSolutions.txt
java HillClimbingServer $1 224.0.0.35 12345 $2 ../data/hugeRequirements.csv 1000
