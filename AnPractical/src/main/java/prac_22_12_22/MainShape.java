package prac_22_12_22;


//Q3 Create a class named 'Shape' with a method to print "This is shape". Then create two
//      other classes named 'Rectangle', 'Circle' inheriting the Shape class, and overriding
//      the Shape method by printing "This is rectangular shape" and "This is circular shape"
//      respectively.

class Shape {
  public void print() {
      System.out.println("This is a shape");
  }
}

class Rectangle extends Shape {
  @Override
  public void print() {
      System.out.println("This is a rectangular shape");
  }
}

class Circle extends Shape {
  @Override
  public void print() {
      System.out.println("This is a circular shape");
  }
}

public class MainShape {
  public static void main(String[] args) {
      Shape shape = new Shape();
      shape.print();

      Shape rectangle = new Rectangle();
      rectangle.print();

      Shape circle = new Circle();
      circle.print();
  }
}
