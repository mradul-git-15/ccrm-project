System Requirements
1. Software

Operating System: Windows 10 or higher (project tested on Windows).

Java Development Kit (JDK): Version 17 or later.

Command-Line Interface (CLI): Windows Command Prompt or PowerShell.

Optional Tools: Any text editor (Notepad, VS Code) for code viewing.

2. Hardware

Minimum 4 GB RAM.

1.5 GB free disk space (for JDK + project files).

Dual-core processor or higher.

Installation Steps

Install Java JDK

Download JDK 17 or above from Oracle
 or OpenJDK
.

Install by following the setup wizard.

Add bin folder of JDK to your PATH environment variable.

Verify Installation
Open Command Prompt and run:

java -version
javac -version


Both commands should display the installed version.

Download/Clone Project

If using Git:

git clone https://github.com/mradul-git-15/ccrm-project.git
cd ccrm-project


Or download as ZIP and extract into C:\CCRM.

Steps to Run the Project

Navigate to the project folder:

cd C:\CCRM


Compile all source files:

javac -d bin @sources.txt


Run the program:

java -cp bin edu.ccrm.cli.Main

Dependencies

No third-party libraries are required.

Entirely built on Java SE (Standard Edition). 
