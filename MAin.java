import geometry.Point;
import geometry.Circle;
import geometry.ColoredCirlce;
import geometry.Rectangle;
import geometry.Square;

public class Main {

	public static void main(String[] args) {
		Point punkt1 = new Point();
		punkt1.setX(5);
		punkt1.setY(6);
		
		double wspX = punkt1.getX();
		double wspY = punkt1.getY();
		
		System.out.println("Współrzędne pliku to:\nx = " + wspX + "\ny = " + wspY);

		Circle kolo = new Circle(punkt1);
		System.out.println("Promien kola to " + kolo.getRadius() + "\nPole koła to " + kolo.getArea());
		System.out.println("Obwod kola to " + kolo.calculatePerimeter());
		double[] tab = kolo.getCenter();
		System.out.println("Srodek kola znajduje sie w punkcie x = " + tab[0] + " || y = " + tab[1]);
		
		ColoredCirlce kolorowe = new ColoredCirlce(punkt1);
		System.out.println("Kolor koła: " + kolorowe.getColor());
		
		System.out.println("Promien kola: " + kolorowe.getRadius() + "\nPole koła to " + kolorowe.getArea());
		System.out.println("Obwod kola: " + kolorowe.calculatePerimeter());
		tab = kolorowe.getCenter();
		System.out.println("Srodek kola znajduje sie w punkcie x = " + tab[0] + " || y = " + tab[1]);
		
		
		Circle tablica[] = new Circle[2];
		tablica[0] = kolo;
		tablica[1] = kolorowe;
		
		
		for(Object kolko : tablica) {
			
			if(kolko instanceof ColoredCirlce) {
				ColoredCirlce tymczas = (ColoredCirlce) kolko;
				System.out.println("Obiekt klasy ColoredCircle \nPole: " + tymczas.getArea() + "\nKolor: " + tymczas.getColor() );
				tymczas = null;
			
			}else if(kolko instanceof Circle) {
				Circle tymczas = (Circle) kolko;
				System.out.println("Obiekt klasy Circle \nPole to " + tymczas.getArea() );
				tymczas = null;
			}
		}
		
		Rectangle prost = new Rectangle(7 , 6.5);
		System.out.println("Obw prostokąta: " + prost.calculatePerimeter() + "\nPole prostokąta: " + prost.calculateArea());
		
		Square kwadrat = new Square(5);
		System.out.println("Pole kwadratu: " + kwadrat.calculateArea() + "\nObwód kwadratu: " + kwadrat.calculatePerimeter());
		
	}
}
