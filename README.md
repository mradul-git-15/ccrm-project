Campus Course & Records Manager (CCRM)
 Project Overview

The Campus Course & Records Manager (CCRM) is a Java-based system designed to simplify the management of student and course information within an academic environment. It allows administrators to add, list, and update records in a structured manner, while also providing features for secure backup and exporting of stored data. The project demonstrates core object-oriented programming concepts such as encapsulation, inheritance, polymorphism, and abstraction, and integrates file-handling operations for persistence.

 Features

Student Management: Add new students and display the student list.

Course Management: Create and view courses with details such as code, credits, semester, and instructor.

Enrollment & Records: Map students to courses and maintain academic details.

Backup & Export: Save all data into timestamped folders and CSV files for external use.

Menu-Driven Interface: Command-line menus for intuitive navigation.

 Evolution of Java

Java 1.0 (1996): Initial release with applet support.

Java 2 (1998): Introduction of Swing, Collections Framework.

Java 5 (2004): Generics, enhanced for-loop, annotations.

Java 8 (2014): Lambda expressions, Streams API, default methods.

Java 17 (2021): Long-Term Support version, pattern matching, sealed classes.

 Editions of Java
Edition	Purpose	Example Use
Java SE	Core Java for desktop/CLI apps	CCRM Project
Java EE	Enterprise apps (web servers, APIs)	Online University Portals
Java ME	Mobile/embedded devices	Smart cards, IoT
 Java Architecture

JDK (Java Development Kit): Tools + compiler (javac) for developers.

JRE (Java Runtime Environment): Libraries + JVM for running applications.

JVM (Java Virtual Machine): Executes compiled bytecode independent of OS.

Flow:
Source Code (.java) → Compiler (javac) → Bytecode (.class) → JVM Execution

 Setup Instructions

Install Java JDK 17 or later

Download from Oracle
 or OpenJDK
.

Verify installation:

java -version
javac -version


Compile Project

From project root (C:\CCRM):

javac -d bin @sources.txt


Run Project

java -cp bin edu.ccrm.cli.Main

 Mapping Syllabus Topics to Project Files
Concept	Implementation
Encapsulation	Student.java, Course.java (private fields + getters/setters)
Inheritance	CourseServiceImpl.java (implements service interface)
Polymorphism	Method overriding in service classes
Abstraction	Service interfaces (StudentService, CourseService)
File Handling	FileStorageService.java, BackupService.java
Exception Handling	Try-catch blocks in CLI input and I/O operations
 Assertions

Assertions can be enabled to check assumptions during runtime:

java -ea -cp bin edu.ccrm.cli.Main

 Test Data

Place sample files in test-data/ before running import/export features.

students.csv

id,name,major
1,MRADUL YADAV,BTECH4
2,ANITA SINGH,BTECH3
3,RAHUL KUMAR,BTECH2


courses.csv

code,title,credits,instructor,semester,department
C101,Java Programming,4,Dr. Smith,Fall,CS
C102,Data Structures,3,Dr. John,Spring,CS
C103,Database Systems,3,Dr. Lee,Fall,CS

 Screenshots (to be placed in screenshots/ folder)

java_version.png → Output of java -version

add_student.png → Student creation menu

list_students.png → Display students

add_course.png → Course creation menu

list_courses.png → Display courses

backup_folder.png → Backup folder with timestamp

 Acknowledgements

This project was created as part of the Programming in Java course requirements.
All design, implementation, and documentation are original. References were made to official Java documentation and standard textbooks only.
