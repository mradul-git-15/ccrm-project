How to Use the CCRM System

The Campus Course & Records Manager is operated through a menu-driven command-line interface. Each option corresponds to a specific function in the system.

1. Add Student

Select option 1 from the menu.

Provide the student ID (integer), name, and major.

Example:

Enter Student ID: 101
Enter Student Name: MRADUL YADAV
Enter Student Major: BTECH4


Output:

Student MRADUL YADAV added successfully.

2. List Students

Select option 2 from the menu.

Displays all stored students in a tabular format.

Example output:

ID: 101, Name: MRADUL YADAV, Major: BTECH4
ID: 102, Name: ANITA SINGH, Major: BTECH3

3. Add Course

Select option 3 from the menu.

Provide details: course code, title, credits, instructor, semester, department.

Example:

Enter Course Code: C101
Enter Course Title: Java Programming
Enter Credits: 4
Enter Instructor: Dr. Smith
Enter Semester: Fall
Enter Department: CS


Output:

Course Java Programming added successfully.

4. List Courses

Select option 4.

Displays all existing course records.

Example:

Code: C101, Title: Java Programming, Credits: 4, Instructor: Dr. Smith, Semester: Fall, Dept: CS

5. Backup Data

Select option 5.

Creates a timestamped folder under /backup and copies .dat and .csv files.

Example output:

Backup completed at: C:\CCRM\backup\20250925_145500

6. Exit

Select option 6 to terminate the program safely.

Additional Notes

Test Data: Predefined files (students.csv, courses.csv) are available in /test-data.

Export/Backup Verification: After running backup/export, check respective folders to confirm files were generated.

Error Handling: The program validates IDs (must be integers) and rejects invalid input automatically.
