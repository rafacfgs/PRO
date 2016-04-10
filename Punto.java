package FORMAS_GEOMÉTRICAS;

import java.util.Scanner;

public class Punto {

	//Definimos los atributos:
	
	private double x;
	private double y;
	
	//Creamos constructores:
	
	Punto(double x, double y){//Inicializan los atributos
		setx(x);
		sety(y);
	}
	
	Punto(){//Inicializa a 0
	
	}
	
	//Creamos los setter (asignan):
	
	public void setx(double x)	{
		this.x = x;
	}
	
	public void sety(double y)	{
		this.y = y;
	}
	
	//Creamos los getter (obtienen):
	
	public double getx()	{
		return x;
	}
	
	public double gety()	{
		return y;
	}
	
	//Creamos un método:
	
	public static double calcularDistanciaDesde (Punto pto){
		double distancia;
		double x1 = pto.getx();
		double y1 = pto.gety();
		
		distancia = Math.sqrt(Math.pow((this.x - x1), 2) + Math.pow((this.y - y1), 2));
		
		System.out.println ("x1: "+x1+" x2: "+this.x+" y1: "+y1+" y2: "+this.y);
		
		return distancia;
	}

}//END CLASS
