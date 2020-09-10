
public class Square extends Shape{
	private double length, height;
	
	public Square(String name) {
		super(name);
	}
	
	public void setDimensions(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Length:" + length + ", Height:" + height);
	}
	
	@Override
	public double getArea() {
		System.out.println("Area: " + length * height);
	}
}
