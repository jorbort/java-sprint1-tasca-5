# java-sprint1-tasca-5
Task 5 of the Java bootcamp with Spring Boot

## Level 1

### Exercise 1
Create a class that lists the contents of a directory received as a parameter in alphabetical order.

### Exercise 2
Add to the class from the previous exercise the functionality to list a directory tree with the contents of all its levels (recursively) so that they are printed on the screen in alphabetical order within each level, also indicating whether it is a directory (D) or a file (F), and its last modification date.

### Exercise 3
Modify the previous exercise. Now, instead of displaying the result on the screen, save the result in a TXT file.

### Exercise 4
Add the functionality to read any TXT file and display its content on the console.

### Exercise 5
Now the program must serialize a Java Object to a .ser file and then deserialize it.

## Level 2

### Exercise 1
Execute exercise 3 from the previous level by parameterizing all methods in a configuration file.

You can use a Java Properties file or the Apache Commons Configuration library if you prefer.

From the previous exercise, parameterize the following:
- Directory to read.
- Name and directory of the resulting TXT file.

### To test it
you can modify the parameters inside the config.properties file on the directory lvl2/ex01 . 