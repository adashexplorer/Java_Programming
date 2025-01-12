package com.dash.abinash.exceptionhandling;

/**
 *  This class shows a basic example of an Exception
 */
public class ExceptionExample {
    public static void main(String[] args) { // What is the difference between in writing String[] and String...
        int a = 5;
        System.out.println(a/0);
    }
}

/**
 * /Library/Java/JavaVirtualMachines/jdk-23.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=51788:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/adash/Hustle/Java_Programming/out/production/core_java com.dash.abinash.exceptionhandling.ExceptionExample
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	at com.dash.abinash.exceptionhandling.ExceptionExample.main(ExceptionExample.java:9)
 *
 * Process finished with exit code 1
 */
