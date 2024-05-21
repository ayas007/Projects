cd `dirname $0`

export CLASSPATH=$CLASSPATH:./libs/JPlanner.jar
mkdir ./bin
javac -d ./bin ./src/*.java
cd bin
java -cp ./:./../libs/JPlanner.jar MainWindow
cd ..
echo “Done”