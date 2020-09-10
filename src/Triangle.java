
public class Triangle extends Shape {
	double sideA, sideB, sideC;
	
	public Triangle(String name) {
		super(name);
	}
	
	public void setDimensions(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	@Override 
	public void printDimensions() {
		System.out.println("Side A: " + sideA);
		System.out.println("Side B: " + sideB);
		System.out.println("Side C: " + sideC);
	}
	
	@Override
	public double getArea() {
		double perim = sideA+sideB+sideC;
		return (Math.sqrt(perim * (perim - sideA) * (perim - sideB)*
				(perim - sideC)));
	}
	
}
