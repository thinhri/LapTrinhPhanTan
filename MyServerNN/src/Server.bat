javac *.java
rmic TinhToan
start rmiregistry
java -cp .;sqljdbc4-2.0.jar MyServer