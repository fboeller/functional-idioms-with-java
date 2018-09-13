#!/bin/bash

# Build LaTeX sources
cd slides
pdflatex presentation.tex
pdflatex presentation.tex
cp presentation.pdf ..
cd ..

# Build Java sources
mkdir output &> /dev/null
javac -sourcepath src/**/*.java -d output
