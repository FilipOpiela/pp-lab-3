import geometry.Point;
import geometry.Circle;
public class Main {

	public static void main(String[] args) {
		Point punkt1 = new Point();
		punkt1.setX(5);
		punkt1.setY(6);
		
		double wspX = punkt1.getX();
		double wspY = punkt1.getY();
		
		System.out.println("Wspolrzędne pliku:\nx = " + wspX + "\ny = " + wspY);

		
		Circle kolo = new Circle(punkt1);
		System.out.println("Promien kola: " + kolo.getRadius() + "\nPole koła: " + kolo.getArea());
		System.out.println("Obwod kola: " + kolo.calculatePerimeter());
		double[] tab = kolo.getCenter();
		System.out.println("Srodek kola jest w punkcie x = " + tab[0] + " || y = " + tab[1]);
	}
}
