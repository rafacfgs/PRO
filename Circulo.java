package FORMAS_GEOMÉTRICAS;

public class Circulo {

	//Definimos los atributos:
	private Punto centro;
	private double radio;
	
	//Crearmos constructores:
	
	Circulo(){//Inicializar a 0
		centro = new Punto();
		radio = 0;
	}
	
	Circulo(Punto centro, double radio){
		setcentro (centro);
		setradio (radio);
	}
	
	Circulo (double x, double y, double radio){
		centro = new Punto (x, y);
		setradio (radio);
	}
	
	//Creamos setter(asignan):
	
	public void setcentro (Punto centro){
		this.centro = centro;
	}
	
	public void setradio(double radio){
		this.radio = radio;
	}
	
	//Creamos getter(obtener):
	
	public Punto getcentro(){
		return centro;
	}
	
	public double getradio(){
		return radio;
	}
	
	//Creamos métodos:
	
	public static double calcularArea(double r){
		double area;
		
		area = Math.PI * r * r;
		
		return area;
	}
	
	public static double calcularPerimetro(double r){
		double perimetro;
		
		perimetro = 2* Math.PI *r;
		
		return perimetro;
	}
	
	public static double calcularDistanciaDesde (Punto pto1, Punto centro){
		double distancia;
		double x1, y1;
		double x2, y2;
		
		x1 = pto1.getx();
		y1 = pto1.gety();
		x2 = centro.getx();
		y2 = centro.gety();
		
		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));		
		
		return distancia;
	}
	
}//END CLASS
