package prac_22_12_22;

//Q1 Create a class to print the area of a square and a rectangle. The class has two
//methods with the same name but different number of parameters. The method for
//printing area of rectangle has two parameters which are length and breadth
//respectively while the other method for printing area of square has one parameter
//which is side of square.
public class AreaPrint{
public static void main(String[] args) {
// Use the methods
printArea(40); //sides of square
printArea(30, 40); //length & breadth of rectangle
}

public static void printArea(int side) {
System.out.println("The area of the square is: " + side * side);
}

public static void printArea(int length, int breadth) {
System.out.println("The area of the rectangle is: " + length * breadth);
}
}