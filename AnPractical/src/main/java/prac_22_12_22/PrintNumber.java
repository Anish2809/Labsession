package prac_22_12_22;

//Q2 Create a class named 'PrintNumber' to print various numbers of different data types
//by creating different methods with the same name 'print' having a parameter for
//each data type.
public class PrintNumber {
public static void main(String[] args) {
print(10);
print(10.5);
print("10");
}

public static void print(int num) {
System.out.println("The number is: " + num);
}

public static void print(double num) {
System.out.println("The number is: " + num);
}

public static void print(String num) {
System.out.println("The number is: " + num);
}
}
