package FORMAS_GEOMÉTRICAS;

//Se supone que es un triángulo rectángulo.

public class Triangulo {

	//Definimos los atributos:
	Punto p1;
	Punto p2;
	Punto p3;
	
	//Creamos los constructores:
	
	Triangulo(){
		
	}
	
	Triangulo (Punto p1, Punto p2, Punto p3){
		
	}
	
	Triangulo (double x1, double y1, double x2, double y2, double x3, double y3){
		double base = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double h = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		double hipotenusa = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
	}
	
	//Métodos setter(asignan):
	
	public void setp1(Punto p1){
		this.p1 = p1;
	}
	public void setp2 (Punto p2){
		this.p2 = p2;
	}
	public void setp3 (Punto p3){
		this.p3 = p3;
	}
	
	//Métodos getter(obtienen):
	
	public Punto getp1 (){
		return p1;
	}
	public Punto getp2(){
		return p2;
	}
	public Punto getp3(){
		return p3;
	}
	
	//Métodos:
	
	public static double calcularArea(double x1, double y1, double x2, double y2, double x3, double y3){
		double area;
		double base;
		double h;
		double hipotenusa;
			
		base = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		h = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		hipotenusa = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		
		area = (base * h) / 2;
		
		return area;
	}
	
	public static double calcularPerimetro(double x1, double y1, double x2, double y2, double x3, double y3){
		double perimetro;
		double base;
		double h;
		double hipotenusa;

		base = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		h = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		hipotenusa = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
	
		System.out.println ("Base: "+base+" Altura: "+h+" Hipotenusa: "+hipotenusa);
		System.out.println ("x1: "+x1+" x2: "+x2+" x3: "+x3+" y1: "+y1+" y2: "+y2+" y3: "+y3);
		
		perimetro = base + h + hipotenusa;
		
		return perimetro;
	}
	
}//END CLASS
