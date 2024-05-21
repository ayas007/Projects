set CLASSPATH=%CLASSPATH%;libs\JPlanner.jar
md bin
javac -d bin src/*.java
cd bin
java -cp ./;..\libs\JPlanner.jar MainWindow
cd..
pause..