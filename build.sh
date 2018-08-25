#!/bin/bash

mkdir output &> /dev/null
javac -sourcepath src/**/*.java -d output
