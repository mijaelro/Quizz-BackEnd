package com.mijael.Quizz.clr;

import com.mijael.Quizz.beans.Category;
import com.mijael.Quizz.beans.Question;
import com.mijael.Quizz.repos.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
@RequiredArgsConstructor
public class InnitJavaQuestions implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    @Override
    public void run(String... args) throws Exception {

        Question q1 = Question.builder()
                .category(Category.JAVA)
                .question("Which of the following option leads to the portability and security of Java?")
                .options(Arrays.asList("Bytecode is executed by JVM", "The applet makes the Java code secure and portable",
                        "Use of exception handling", "Dynamic binding between objects"))
                .answer("Bytecode is executed by JVM")
                .build();

        Question q2 = Question.builder()
                .category(Category.JAVA)
                .question("Which of the following is not a Java features?")
                .options(Arrays.asList("Dynamic", "Architecture Neutral",
                        "Use of pointers", "Object-oriented"))
                .answer("Use of pointers")
                .build();

        Question q3 = Question.builder()
                .category(Category.JAVA)
                .question("____ is used to find and fix bugs in the Java programs.")
                .options(Arrays.asList("JDK", "JVM",
                        "JDB", "JRE"))
                .answer("JDB")
                .build();

        Question q4 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is the return type of the hashCode() method in the Object class?")
                .options(Arrays.asList(
                        "Object",
                        "int",
                        "long",
                        "void"))
                .answer("int")
                .build();

        Question q5 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the following is a valid long literal?")
                .options(Arrays.asList(
                        "ABH8097",
                        "L990023",
                        "904423",
                        "0xnf029L"))
                .answer("0xnf029L")
                .build();

        Question q6 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What does the expression float a = 35 / 0 return?")
                .options(Arrays.asList(
                        "0",
                        "Not a Number",
                        "Infinity",
                        "Run time exception"))
                .answer("Infinity")
                .build();

        Question q7 = Question.builder()
                .category(Category.JAVA)
                .question(
                        " Which of the following for loop declaration is not valid?")
                .options(Arrays.asList(
                        "for ( int i = 99; i >= 0; i / 9 )",
                        "for ( int i = 7; i <= 77; i += 7 )",
                        "for ( int i = 20; i >= 2; - -i )",
                        "for ( int i = 2; i <= 20; i = 2* i )"))
                .answer("for ( int i = 99; i>=0; i / 9)")
                .build();

        Question q8 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?")
                .options(Arrays.asList(
                        "getClass()",
                        "intern()",
                        "getName()",
                        "toString()"))
                .answer("getName()")
                .build();

        Question q9 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the following is true about the anonymous inner class?")
                .options(Arrays.asList(
                        "It has only methods",
                        "Objects can't be created",
                        "It has a fixed class name",
                        "It has no class name"))
                .answer("It has no class name")
                .build();

        Question q10 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which package contains the Random class?\n")
                .options(Arrays.asList(
                        "java.util package",
                        "java.lang package",
                        "java.awt package",
                        "java.io package"))
                .answer("java.util package")
                .build();

        Question q11 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "An interface with no fields or methods is known as a ______.")
                .options(Arrays.asList(
                        "Runnable Interface",
                        "Marker Interface",
                        "Abstract Interface",
                        "CharSequence Interface"))
                .answer("Marker Interface")
                .build();

        Question q12 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which option is false about the final keyword?")
                .options(Arrays.asList(
                        "A final method cannot be overridden in its subclasses.",
                        "A final class cannot be extended.",
                        "A final class cannot extend other classes.",
                        "A final method can be inherited."))
                .answer("A final class cannot extend other classes.")
                .build();

        Question q13 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of these classes are the direct subclasses of the Throwable class?")
                .options(Arrays.asList(
                        "RuntimeException and Error class",
                        "Exception and VirtualMachineError class",
                        "Error and Exception class",
                        "IOException and VirtualMachineError class"))
                .answer("Error and Exception class")
                .build();

        Question q14 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "In which memory a String is stored, when we create a string using new operator?")
                .options(Arrays.asList(
                        "Stack",
                        "String memory",
                        "Heap memory",
                        "Random storage space"))
                .answer("Heap memory")
                .build();

        Question q15 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is the use of the intern() method?")
                .options(Arrays.asList(
                        "It returns the existing string from memory",
                        "It creates a new string in the database",
                        "It modifies the existing string in the database",
                        "None of the above"))
                .answer("It returns the existing string from the memory")
                .build();

        Question q16 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "In java, jar stands for_____.")
                .options(Arrays.asList(
                        "Java Archive Runner",
                        "Java Application Resource",
                        "Java Application Runner",
                        "None of the above"))
                .answer("None of the above")
                .build();

        Question q17 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the given methods are of Object class?")
                .options(Arrays.asList(
                        "notify(), wait( long msecs ), and synchronized()",
                        "wait( long msecs ), interrupt(), and notifyAll()",
                        "notify(), notifyAll(), and wait()",
                        "sleep( long msecs ), wait(), and notify()"))
                .answer("notify(), notifyAll(), and wait()")
                .build();

        Question q18 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is meant by the classes and objects that dependents on each other?")
                .options(Arrays.asList(
                        "Tight Coupling",
                        "Cohesion",
                        "Loose Coupling",
                        "None of the above"))
                .answer("Tight Coupling")
                .build();

        Question q19 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "How many threads can be executed at a time?")
                .options(Arrays.asList(
                        "Only one thread",
                        "Multiple threads",
                        "Only main (main() method) thread",
                        "Two threads"))
                .answer("Multiple threads")
                .build();

        Question q20 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "If three threads trying to share a single object at the same time, which condition will arise in this scenario?")
                .options(Arrays.asList(
                        "Time-Lapse",
                        "Critical situation",
                        "Race condition",
                        "Recursion"))
                .answer("Race condition")
                .build();

        Question q21 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "If a thread goes to sleep")
                .options(Arrays.asList(
                        "It releases all the locks it has.",
                        "It does not release any locks.",
                        "It releases half of its locks.",
                        "It releases all of its lock except one."))
                .answer("It does not release any locks.")
                .build();

        Question q22 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the following are not Java keywords ?")
                .options(Arrays.asList(
                        "double",
                        "then",
                        "switch",
                        "instanceof"))
                .answer("then")
                .build();

        Question q23 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed?")
                .options(Arrays.asList(
                        "Local variables",
                        "Class Variables",
                        "Instance variables",
                        "Static variables"))
                .answer("Instance variables")
                .build();

        Question q24 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Java language was initially called as ________")
                .options(Arrays.asList(
                        "Sumatra",
                        "J++",
                        "Oak",
                        "Pine"))
                .answer("Oak")
                .build();

        Question q25 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is garbage collection in the context of Java?")
                .options(Arrays.asList(
                        "Java deletes all unused java files on the system.",
                        "Memory used by the object with no reference is automatically reclaimed.",
                        "The JVM cleans output of Java program with error.",
                        "Any unused package in a program automatically gets deleted."))
                .answer("Memory used by the object with no reference is automatically reclaimed.")
                .build();

        Question q26 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which one is a template for creating different objects ?")
                .options(Arrays.asList(
                        "An Array",
                        "A class",
                        "Interface",
                        "Method"))
                .answer("A class")
                .build();

        Question q27 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which symbol is used to contain the values of automatically initialized arrays?")
                .options(Arrays.asList(
                        "Brackets",
                        "Braces",
                        "Parentheses",
                        "Comma"))
                .answer("Braces")
                .build();

        Question q28 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which one is true about a constructor ?")
                .options(Arrays.asList(
                        "A constructor must have the same name as the class it is declared within.",
                        "A constructor is used to create objects.",
                        "A constructor may be declared private",
                        "All of the above"))
                .answer("All of the above")
                .build();

        Question q29 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of these operators is used to allocate memory to array variable in Java?")
                .options(Arrays.asList(
                        "alloc",
                        "new malloc",
                        "malloc",
                        "new"))
                .answer("new")
                .build();

        Question q30 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Modulus operator (%) can be applied to which of these?")
                .options(Arrays.asList(
                        "Integers",
                        "Floating - point numbers",
                        "Both A and B",
                        "None of These"))
                .answer("Both A and B")
                .build();

        Question q31 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What feature of OOP has a super-class sub-class concept?")
                .options(Arrays.asList(
                        "Hierarchical inheritance",
                        "Single inheritance",
                        "Multiple inheritances",
                        "Multilevel inheritance"))
                .answer("Hierarchical inheritance")
                .build();

        Question q32 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the following are not the methods of the Thread class?")
                .options(Arrays.asList(
                        "yield()",
                        "go()",
                        "sleep(long msec)",
                        "stop()"))
                .answer("go()")
                .build();

        Question q33 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is the full form of JVM ?")
                .options(Arrays.asList(
                        "Java Very Large Machine",
                        "Java Very Small Machine",
                        "Java Verified Machine",
                        "Java Virtual Machine"))
                .answer("Java Virtual Machine")
                .build();

        Question q34 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "In Java code, the line that begins with /* and ends with */ is known as?")
                .options(Arrays.asList(
                        "Multiline comment",
                        "Both A & B",
                        "Single line comment",
                        "None of these"))
                .answer("Multiline comment")
                .build();

        Question q35 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of the following are not Java modifiers?")
                .options(Arrays.asList(
                        "public",
                        "friendly",
                        "private",
                        "transient"))
                .answer("friendly")
                .build();

        Question q36 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is true about threads?")
                .options(Arrays.asList(
                        "Threads consumes CPU in best possible manner",
                        "Threads enables multi processing.",
                        "Multi threading reduces idle time of CPU",
                        "All"))
                .answer("All")
                .build();
        Question q37 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "A thread can acquire a lock by using which reserved keyword?")
                .options(Arrays.asList(
                        "volatile",
                        "synchronized",
                        "locked",
                        "none"))
                .answer("synchronized")
                .build();

        Question q38 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "How many threads can a process contain?")
                .options(Arrays.asList(
                        "1",
                        "2",
                        "multiple",
                        "none"))
                .answer("multiple")
                .build();

        Question q39 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is sometimes also called a lightweight process?")
                .options(Arrays.asList(
                        "Thread",
                        "Process",
                        "JVM",
                        "JWT"))
                .answer("Thread")
                .build();

        Question q40 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What are valid points about thread")
                .options(Arrays.asList(
                        "Thread are subdivision of Process.",
                        "One or more Threads runs in the context of process.",
                        "Threads can execute any part of process. And same part of process can be executed by multiple Threads.",
                        "All"))
                .answer("All")
                .build();

        Question q41 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What are valid point about processes\n")
                .options(Arrays.asList(
                        "Processes have their own copy of the data segment of the parent process",
                        "Threads have direct access to the data segment of its process",
                        "Processes have their own address",
                        "All of these"))
                .answer("All of these")
                .build();

        Question q42 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which is thread safe?")
                .options(Arrays.asList(
                        "StringBuffer",
                        "StringBuilder",
                        "All",
                        "None"))
                .answer("StringBuffer")
                .build();

        Question q43 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "How can we create Thread")
                .options(Arrays.asList(
                        "By Extending Thread class",
                        "Implementing Runnable interface",
                        "By using Executor framework - which can internally form threads",
                        "All"))
                .answer("All")
                .build();

        Question q44 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which of these is not a Thread state?")
                .options(Arrays.asList(
                        "New",
                        "Runnable",
                        "sleep",
                        "terminated"))
                .answer("sleep")
                .build();

        Question q45 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "synchronized instance methods acquire lock on?")
                .options(Arrays.asList(
                        "object",
                        "class",
                        "All",
                        "None"))
                .answer("object")
                .build();

        Question q46 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What state does Thread enter in when it has been created and started?")
                .options(Arrays.asList(
                        "New",
                        "Runnable",
                        "Running",
                        "Waiting"))
                .answer("Running")
                .build();

        Question q47 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "Which method can be used to find whether Thread hasn't entered dead state?")
                .options(Arrays.asList(
                        "isAlive()",
                        "isRunning()",
                        "isNotDead",
                        "All"))
                .answer("isAlive()")
                .build();

        Question q48 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "How can you ensure all threads that started from main must end in order in which they started and also main should end in last")
                .options(Arrays.asList(
                        "join() method",
                        "sleep() method",
                        "wait() method",
                        "run() method"))
                .answer("join() method")
                .build();
        Question q49 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is true about acquiring object lock before calling wait(), notify() and notifyAll()?")
                .options(Arrays.asList(
                        "it’s mandatory to acquire object lock before calling wait(), notify() and notifyAll() methods on object",
                        "If we call wait(), notify() and notifyAll() methods without acquiring object lock i.e. from outside synchronize block then java.lang.IllegalMonitorStateException is thrown at runtime.",
                        "wait(), notify() and notifyAll() methods are always called from Synchronized block only",
                        "all"))
                .answer("all")
                .build();

        Question q50 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "What is difference between starting thread with run() and start() method?")
                .options(Arrays.asList(
                        "There is no difference",
                        "When you call start() method, main thread internally calls run() method to start newly created Thread",
                        "run() calls start() method internally",
                        "None"))
                .answer("When you call start() method, main thread internally calls run() method to start newly created Thread")
                .build();

        Question q51 = Question.builder()
                .category(Category.JAVA)
                .question(
                        "How can Thread go from waiting to runnable state?")
                .options(Arrays.asList(
                        "notify/notifAll",
                        "When sleep time is up",
                        "Using resume() method when thread was suspended",
                        "All"))
                .answer("All")
                .build();


        questionRepository.saveAll(Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20
                , q21, q22, q23, q24, q25, q26, q27, q28, q29, q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40, q41, q42, q43, q44, q45, q46, q47, q48, q49, q50, q51));
    }
}
