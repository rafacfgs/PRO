package FORMAS_GEOMÉTRICAS;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("\n******	FIGURAS ******\n");
				
		/** Cree e inicialice dos objetos de la clase punto y muestre la distancia entre ellos.*/
		
		Punto pto1;
		Punto pto2;
		double x1, y1;//pto1
		double x2, y2;//pto2
		double distancia;
		
		System.out.println ("Punto 1");
		System.out.println ("x: ");
		x1 = teclado.nextDouble();
		System.out.println ("y: ");
		y1 = teclado.nextDouble();
		
		pto1 = new Punto (x1, y1);
		
		System.out.println ("Punto 2");
		System.out.println ("x: ");
		x2 = teclado.nextDouble();
		System.out.println ("y: ");
		y2 = teclado.nextDouble();
		
		pto2 = new Punto (x2, y2);
		
		System.out.println ("Punto 1: ("+x1+", "+y1+")\nPunto 2: ("+x2+", "+y2+")");
		
		distancia = pto1.calcularDistanciaDesde (pto2);
		
		System.out.println ("Distancia entre Punto 1 y Punto 2 = "+distancia);
		
		
		
		//**************************************************************************************************************************************/
		
		/** Cree un objeto de la clase Circulo, calcule su área y su perímetro y muestre la
		distancia hasta el primero de los puntos creados anteriormente.*/
		
		Circulo cir;
		double r;//Radio
		double x3, y3;//punto medio == centro
		Punto centro;
		double area;
		double perimetro;
		
		System.out.println ("\n** CÍRCULO **\n");
		System.out.println ("Introduzca los valores para el punto medio del círculo: (x, y)");
		x3 = teclado.nextDouble();
		y3 = teclado.nextDouble();
		centro = new Punto (x3, y3);
		System.out.println ("Introduzca el radio");
		r = teclado.nextDouble();
		
		area =  Math.PI * r * r;
		perimetro = 2 * Math.PI *r;
		
		System.out.println ("Área = "+area+"\nPerímetro = "+perimetro);
		
		distancia = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		System.out.println ("Distancia entre círculo y Punto 1 = "+distancia);
		
		
		//*********************************************************************************************************************************/
		
		/** Cree un objeto de la clase Triangulo, calcule su área y su perímetro.*/
		
		
		double base;
		double h;//Altura
		double hipotenusa;
		Punto p1, p2, p3;
		double px1, py1, px2, py2, px3, py3;
		
		System.out.println ("\n** TRIÁNGULO **\n");
		System.out.println ("A (x, y):");
		px1 = teclado.nextDouble();
		py1 = teclado.nextDouble();
		
		p1 = new Punto (px1, py1);
		
		System.out.println ("B (x, y):");
		px2 = teclado.nextDouble();
		py2 = teclado.nextDouble();
		
		p2 = new Punto (px1, py1);
		
		System.out.println ("C (x, y):");
		px3 = teclado.nextDouble();
		py3 = teclado.nextDouble();
		
		p3 = new Punto (px3, py3);
		
		Triangulo tri = new Triangulo (p1, p2, p3);//Definimos el objeto 'tri' de la clase Triangulo

		area = tri.calcularArea(px1, py1, px2, py2, px3, py3);
		perimetro = tri.calcularPerimetro(px1, py1, px2, py2, px3, py3);
		
		
		System.out.println ("Área = "+area+"\nPerímetro = "+perimetro);

	}//END MAIN

}//END CLASS
