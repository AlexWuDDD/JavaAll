#!/bin/bash

testjar=".:../lib/junit-4.13.2.jar:../lib/hamcrest-core-1.3.jar"
otherSrc="com/alex/java/Calculator.java"

javac -cp ${testjar} ${otherSrc} com/alex/test/Test1.java
java -cp ${testjar} org.junit.runner.JUnitCore com.alex.test.Test1


# testjar=".:../lib/junit-4.13.2.jar:../lib/hamcrest-core-1.3.jar"
# javac Calculator.java
# javac -cp ${testjar} Test1.java
# java -cp ${testjar} org.junit.runner.JUnitCore Test1