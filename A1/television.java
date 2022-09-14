package Herencia;

//clase Hija/Heredada(television) de electrodomestico
public class television extends electrodomestico{
	//atributos
	private double resolucion;
	private boolean sintonizadorTDT;
	double precio;
	
	//Constructor atributos por defecto
	public television() {
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
		
	//Constructor con los atributos heredados de electrodomestico
	public television(double precioBase, char consumo, String color, double peso, double resolucion, boolean sintonizadorTDT) {
		//los hereda de electrodomestico
		super(precioBase,consumo,color,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public double precioFinal(double resolucion, boolean sintonizadorTDT, double precioBase) { //calculamos el precio final aprovechando la herencia
		if (resolucion>40) { //si tiene mas de 40 pulgadas aumenta 30%
			precioBase=precioBase+(precioBase*30/100);
		}
		if (sintonizadorTDT=true) {
			//si tiene sintonizadorTDT aumenta 50€
			precioBase=precioBase+50;
		}
		return precioBase;
	}
	
	public void mostrarDatos() {//Usamos los get porque está en private y al ser hija no lo pilla, podriamos cambiarlo a protected pero no
		System.out.println("Precio Base: "+ precioFinal(resolucion,sintonizadorTDT,getPrecioBase())+
				"\nConsumo: "+getConsumo()+
				"\nColor: "+getColor()+
				"\nPeso: "+getPeso()+
				//no hace falta poner get ya que estamos en la misma clase
				"\nResolucion: "+ resolucion+
				"\nSintonizadorTDT: "+ sintonizadorTDT+"\n");
	}
	
	public double precio() { //hacemos este metodo para sacarlo fuera del programa 
		precio=(double) precioFinal(resolucion,sintonizadorTDT,getPrecioBase());
		return precio;
	}
	
	public static void main(String[] args) {
		//creamos una lavadora default
		lavadora defecto = new lavadora();
		//comprobamos la herencia con los default de electrodomestico y lavadora, funciona correctamente
		defecto.mostrarDatos();
		System.out.println();
		
		television kilian = new television(1000,'A',"Negro",70.3,41, true); //creamos
		kilian.mostrarDatos();//mostramos los datos
	 }
}
