package geometry;
import java.lang.Math;
import java.util.Scanner;
public class Circle {
	
	Scanner scan = new Scanner(System.in);
	
	private double[] center = new double[2];
	private double radius;
	
	public void setCenter(Point punkt) {
		center[0] = punkt.getX();
		center[1] = punkt.getY();
		}
	public double[] getCenter() {
		return center;
	}
	
	
	public void setRadius(double x) {
		radius = x;
	}
	public double getRadius() {
		return radius;
	}
	
	public double calculatePerimeter() {
		double per = 2 * 3.14 * radius;
		return per;
	}
	
	public double getArea() {
		return (3.14 * Math.pow(radius, 2));
	}
	public Circle(Point point){

		setCenter(point);
		double tymczasowa;
		System.out.println("Podaj promien kola: ");
		tymczasowa = scan.nextDouble();
		setRadius(tymczasowa);
	}
}