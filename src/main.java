import java.util.*;

public class main{

	public static main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
	Square sq = new Square("square");
	Circle c = new Circle("circle");
	Triangle t = new Triangle("triangle");
	EquilateralTriangle et = new EquilateralTriangle("equil triangle");
	
	System.out.println("Enter the length for the Square: ");
	double length = sc.nextDouble();
	System.out.println("Enter the height for the Square: ");
	double height = sc.nextDouble();
	
	sq.setDimensions(length, height);
	
	System.out.println("Enter the radius for the Circle: ");
	double radius = sc.nextDouble();
	c.setDimensions(radius);

	System.out.println("Enter the first side of the triangle: ");
	double sideA = sc.nextDouble();
	System.out.println("Enter the second side of the triangle: ");
	double sideB = sc.nextDouble();
	System.out.println("Enter the third side of the triangle: ");
	double sideC = sc.nextDouble();
	t.setDimensions(sideA, sideB, sideC);
	
	System.out.println("Enter the side of the equilateral triangle: ");
	double equilSide = sc.nextDouble();
	et.setDimensions(equilSide);
	
	System.out.println(sq.getName());
	sq.printDimensions();
	System.out.println(", Area: " + sq.getArea() + "\n");
	
	System.out.println(c.getName());
	c.printDimensions();
	System.out.println(", Area: " + c.getArea() + "\n");
	
	System.out.println(t.getName());
	t.printDimensions();
	System.out.println(", Area: " + t.getArea() + "\n");
	
	System.out.println(et.getName());
	et.printDimensions();
	System.out.println(", Area: " + et.getArea() + "\n");
	}
}