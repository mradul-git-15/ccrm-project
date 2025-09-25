@echo off
echo Cleaning up old files in domain folder...
del /q src\edu\ccrm\domain\*.java
del /q src\edu\ccrm\domain\*.txt

echo Creating Person.java...
(
echo package edu.ccrm.domain;
echo.
echo public abstract class Person {
echo     protected String id;
echo     protected String name;
echo }
) > src\edu\ccrm\domain\Person.java

echo Creating Student.java...
(
echo package edu.ccrm.domain;
echo.
echo public class Student extends Person {
echo     private String major;
echo.
echo     public Student^(String id, String name, String major^) {
echo         this.id = id;
echo         this.name = name;
echo         this.major = major;
echo     }
echo.
echo     public String getId^(^) { return id; }
echo     public String getName^(^) { return name; }
echo     public String getMajor^(^) { return major; }
echo.
echo     @Override
echo     public String toString^(^) {
echo         return "ID: " ^& id ^& ", Name: " ^& name ^& ", Major: " ^& major;
echo     }
echo }
) > src\edu\ccrm\domain\Student.java

echo Creating Course.java...
(
echo package edu.ccrm.domain;
echo.
echo public class Course {
echo     // Add fields later
echo }
) > src\edu\ccrm\domain\Course.java

echo Creating Enrollment.java...
(
echo package edu.ccrm.domain;
echo.
echo public class Enrollment {
echo     // Add fields later
echo }
) > src\edu\ccrm\domain\Enrollment.java

echo Creating Grade.java enum...
(
echo package edu.ccrm.domain;
echo.
echo public enum Grade {
echo     A, B, C, D, F
echo }
) > src\edu\ccrm\domain\Grade.java

echo Creating Semester.java enum...
(
echo package edu.ccrm.domain;
echo.
echo public enum Semester {
echo     SPRING, SUMMER, FALL
echo }
) > src\edu\ccrm\domain\Semester.java

echo Creating Status.java enum...
(
echo package edu.ccrm.domain;
echo.
echo public enum Status {
echo     ACTIVE, INACTIVE
echo }
) > src\edu\ccrm\domain\Status.java

echo.
echo All domain files have been created successfully!
pause