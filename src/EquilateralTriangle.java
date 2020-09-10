
public class EquilateralTriangle extends Shape {
	double equilSide;
	
	public EquilateralTriangle(String name) {
		super(name);
	}
	
	public void setDimensions(double equilSide) {
		this.equilSide = equilSide;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Side of Equilateral Triangle: " + equilSide);
	}
	
	@Override
	public double getArea() {
		double perim = equilSide*3;
		return (Math.sqrt(perim * (perim - equilSide)*(perim - equilSide)*(perim - equilSide)));
	}
}
