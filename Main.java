import geometry.Point;
import geometry.Circle;
import geometry.ColoredCirlce;

public class Main {

	public static void main(String[] args) {
		Point punkt1 = new Point();
		punkt1.setX(5);
		punkt1.setY(6);
		
		double wspX = punkt1.getX();
		double wspY = punkt1.getY();
		
		System.out.println("Wspolrzędne pliku to:\nx = " + wspX + "\ny = " + wspY);

		
		Circle kolo = new Circle(punkt1);
		System.out.println("Promien kola: " + kolo.getRadius() + "\nPole koła: " + kolo.getArea());
		System.out.println("Obwod kola: " + kolo.calculatePerimeter());
		double[] tab = kolo.getCenter();
		System.out.println("Srodek kola jest w punkcie x = " + tab[0] + " || y = " + tab[1]);
		
		ColoredCirlce kolorowe = new ColoredCirlce(punkt1);
		System.out.println("Kolor koła: " + kolorowe.getColor());
		
		//Kod przekopiowany z poprzedniego koła - nie kolorowego
		System.out.println("Promien kola: " + kolorowe.getRadius() + "\nPole koła: " + kolorowe.getArea());
		System.out.println("Obwod kola: " + kolorowe.calculatePerimeter());
		tab = kolorowe.getCenter();
		System.out.println("Srodek kola jest w punkcie x = " + tab[0] + " || y = " + tab[1]);
		
		
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
				System.out.println("Obiekt klasy Circle \nPole: " + tymczas.getArea() );
				tymczas = null;
			}
		}
	}	
}
