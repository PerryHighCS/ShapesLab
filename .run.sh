export DISPLAY=

# repl.it compile script for greenfoot projects
set -e # exit on errors

echo compiling...

# compile all class files into the build dir
javac *.java -cp .:./lib/jcodec-0.2.5.jar:./lib/jcodec-javase-0.2.5.jar

echo running...

# run the packaged project
java -cp .:./lib/jcodec-0.2.5.jar:./lib/jcodec-javase-0.2.5.jar \
    Picture -D java.awt.headless=true 
    
