# CMPS-11

CMPS 11 - Assignment 1
Problem 1 - Converter (30 points)
  Write a program that helps with converting temperature measured in Fahrenheit or Kelvin to
Celsius degree. You can find temperature conversion formulas here.
There are two lines of input that you can read from the console using Scanner:
  1. The first line contains a character: ’f’ for Fahrenheit degree or ‘k’ for Kelvin degree.
  2. The second line contains a floating-point number representing the degree measured
in the earlier specified temperature unit.
Output should be a single floating-point number showing the converted degree in Celsius
rounded up to two decimal places. Print out the output using System.out.printf(“%.2f",
output_variable); where output_variable is the Celsius degree you calculated.
Problem 2 - Ordered (35 points)
  Write a program that reads in three integers from console, x, y, and z. Then, define
a boolean variable whose value is true if the three values are either in strictly ascending order
(x < y < z) or in strictly descending order (x > y > z), and false otherwise. Your output is the
printed boolean variable.
Problem 3 - Bits (35 points)
  Write a program that takes an integer from console, N, and uses a while loop to compute the
number of times you need to divide N by 2 until it is strictly less than 1. Print out the error
message "Illegal input" if N is less than or equal to 0.
Remark: This computes the number of bits in the binary representation of N, which also
equals to when N is positive.


CMPS 11 - Assignment 2
  Problem 1 - Series (25 points)
Euler's number or is an irrational number approximately equal to 2.7182. In order to
calculate for , we can use the following series representation:
  Write a program that asks user to input two integers. The first integer is the power ,
and the second is a (positive) number of terms, say . Then calculate the approximation for
by evaluating the first terms of the above series. Round the result to 2 decimal places.
Please note that although can be any real number, your code only needs to work for
(integers). You can learn more about here.
  Problem 2 - Matrix (40 points)
Write a program that receives “m” and “n” as the number of rows and columns of a
matrix, respectively. Then it follows by “m” lines of input from the user, each referring to “n”
integers in each row of the matrix.
The program then continuously reads commands from user and performs different
operations based on user’s command. User’s command will be one of the following:
  ❖ T: Transpose - rows become columns (and vice versa) and prints the result matrix.
  ❖ R: RowMultiply - multiplies all values in each of the rows and prints the results in
one line, separated by space.
  ❖ C: ColumnMin - finds the smallest value in each of the columns and prints the
results in one line, separated by space.
  ❖ Q: Quit - stops reading commands from the user.
If user enters one of the first three commands, the operation should be applied to the
original matrix. The result of each operation is either printing a new matrix (if the command
is “T”) or printing the result of calculating RowMultiply or ColumnMin in one line (if the
command is “R” or “C”).
Please note that each of the “T”, “R”, and “C” commands should be applied to the
original matrix (not on the matrix that results from the most recent operation).
If user selects the quit option by entering “Q”, it terminates the program execution.
It will be a good practice if you implement “R”, “C”, and “T” operations using separate
methods.
  Problem 3 - Words (35 points)
We want to find out how many words in our list of words do not have any repeated
characters. All words in our list are only made of characters ‘a’ to ‘z’, all in lowercase. There is
no uppercase or special character in any of them.
  ❖ Input: An integer ’n’ indicating the number of words in our list. Then, it follows
with ’n’ words/strings, each in one line.
  ❖ Output: An integer representing the number of words in our list without any
repeated characters.


CMPS 11 - Assignment 3
  Bingo.java (60 points)
We want to write a Java program to simulate a bingo game. Players use cards that
feature five columns of five cells each, with every cell containing a number between 1 to 90.
In each step of the game a number between 1 and 90 is called randomly and players need to
mark the number in their card if they have it. The first player who marks all of the numbers
in one row of one of his/her cards is the winner of the game. 
  Path.java (40 points)
In this question we want to implement a class to simulate a 2D path composed of
multiple 2D points. Here is the skeleton of the class:
class Path{
Path();
Creates an empty path (without any point). The length of an empty path is zero.
Path addPoint(int x, int y);
Adds a 2D point with (x, y) dimensions to the end of the path and returns the updated path
object. Remember that you do not need to create a new path, you just need to update the path
by adding another point and returning the updated path. With this technique you can add
multiple points to a path in one line: myPath.addPoint(7, 2).addPoint(2, 6);
String getPoint(int i);
Returns one string in the format of “(x, y)” which x and y are dimensions of i-th point in the
path.
int numOfPoints();
Returns the number of points in the path.
boolean removePoint(int i);
Removes i-th point from the path. Indexing of the points on the path starts from zero. If the i-
th point does not exist, it returns false, otherwise, returns true.
void addPath(Path p);
Adds path p to the current path by adding all the points of path p to the end of the current
path object by keeping the order of the points in path p.
double getLength();
Returns the length of the path by summing all the distance between any two consecutive
points.
double getDistance();
Returns the distance between the first and last point on the path.
boolean isLonger(Path p);
Returns true if length of the current path object is greater than the length of the the object
passed as an argument.
}
