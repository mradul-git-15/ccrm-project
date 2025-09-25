Campus Course & Records Manager (CCRM)

A console-based Java SE application to manage students, courses, enrollments, grades, and data backups for an academic institute.

This project demonstrates core and advanced Java concepts, including OOP, exception handling, NIO.2, Streams API, Date/Time API, design patterns, recursion, and functional programming.

 Features
Student Management

Add, list, update, and deactivate students.

Attributes: ID, name, major, status.

Print student profiles.

Course Management

Add, list, update, and deactivate courses.

Attributes: course code, title, credits, instructor, semester, department.

Supports search/filter using Java Streams API.

Enrollment & Grading

Enroll and unenroll students in courses.

Record marks, compute grades, and calculate GPA.

Generate transcripts with overridden toString() methods.

File Operations

Import/export students and courses from CSV-like files.

Backup data to timestamped folders.

Recursive utilities for backup folder size or file listing.

CLI Workflow

Interactive menu-driven interface using if-else, switch, loops, and control flow (break/continue).

Example menu options: Add Student, List Courses, Enroll Student, Export Data, Backup Data.

 How to Run
Prerequisites

Java SE 17+ installed and configured in PATH.

Terminal/Command Prompt access.

Steps

Clone the repository:

git clone https://github.com/username/repository.git
cd repository


Compile project:

javac -d bin @sources.txt


Run the main program:

java -cp bin edu.ccrm.cli.Main


Use the interactive menu to perform operations:

Add Student → menu option 1

List Students → menu option 2

Add Course → menu option 3

List Courses → menu option 4

Backup Data → menu option for backup

Exit → menu option 5

 Project Structure
edu.ccrm/
 ├─ cli/        → Menu-driven console interface
 ├─ domain/     → Entities (Student, Course, etc.)
 ├─ service/    → Business logic (StudentService, CourseService, etc.)
 ├─ io/         → Import/Export, BackupService
 ├─ util/       → Validators, Comparators, recursion utilities
 └─ config/     → AppConfig (Singleton), Builders
test-data/       → CSV files for students & courses
screenshots/     → CLI screenshots of program execution
README.md
requirements.md
USAGE.md

 Evolution of Java

1995 → Java introduced by Sun Microsystems.

1996 → JDK 1.0 released.

2004 → Java 5 introduced generics, annotations, enums.

2011 → Java 7 added try-with-resources, NIO.2.

2014 → Java 8 added lambdas, Streams API, Date/Time API.

2017+ → Regular 6-month release cycle, new features like var, modules, records.

 Java Editions Comparison
Feature	Java ME	Java SE	Java EE
Scope	Mobile, IoT	Desktop, CLI, Core	Web, Enterprise
Libraries	Limited	Core Java APIs	Servlets, JPA, EJB
Example	Mobile app	CCRM project	Banking systems
 Java Architecture

JDK: Full toolkit (compiler, libraries).

JRE: JVM + core libraries to run Java programs.

JVM: Executes Java bytecode, providing OS-independent execution.

Flow: Source Code → javac → Bytecode → JVM → OS Execution

🏗️ Mapping Syllabus Topics → Project Files
Concept	Example Implementation
Encapsulation	Student.java (private fields, getters/setters)
Inheritance	Person.java → Student.java
Abstraction	Person.java (abstract class)
Polymorphism	Transcript generation (toString() override)
Arrays	Course sorting by code
Strings	Name/Email validation, course search
Interfaces	Persistable, Searchable<T>
Lambdas/Streams	Filtering courses by semester
Singleton Pattern	AppConfig.java
Builder Pattern	Course.Builder
Custom Exceptions	DuplicateEnrollmentException, MaxCreditLimitExceededException
NIO.2 & Streams	BackupService.java, ImportExportService.java
Recursion	RecursionUtil.java (directory size)
 Sample Usage

Menu Example:

===== Campus Course & Records Manager =====
1. Add Student
2. List Students
3. Add Course
4. List Courses
5. Exit
Enter choice:


Commands

Add Student → menu option 1 → input details → confirmation.

List Courses → menu option 4 → display all courses.

Enroll Student → menu option 2 or 3 depending on menu.

Export Data → menu option → creates students.csv & courses.csv.

Backup Data → menu option → creates backup/YYYYMMDD_HHMM/.

 Test Data

Location: /test-data folder

students.csv
id,name,major
1,MRADUL YADAV,BTECH4
2,ANITA SINGH,BTECH3
3,RAHUL KUMAR,BTECH2

courses.csv
code,title,credits,instructor,semester,department
C101,Java Programming,4,DR. SMITH,FALL,CS
C102,Data Structures,3,DR. JOHN,SPRING,CS
C103,Database Systems,3,DR. LEE,FALL,CS

 Screenshots (CLI)

java_version.png → Java version in terminal

project_structure.png → Folder layout

compile_project.png → Successful compilation

main_menu.png → Initial menu

add_student.png → Adding student

list_students.png → Listing students

add_course.png → Adding course

list_courses.png → Listing courses

export_data.png → Export CSV files

backup_folder.png → Backup folder creation

Academic Integrity

All code is written originally for educational purposes.

References are cited if any external sources were used.

No plagiarism or AI-generated content is submitted.