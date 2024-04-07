package geometry;

public class ColoredCirlce extends Circle {
	private String color;

	public ColoredCirlce(Point point) {
		super(point);
		System.out.println("Podaj kolor kola: ");
		color = scan.next();		
	}
	
	public String getColor() {
		return color;
	}
}