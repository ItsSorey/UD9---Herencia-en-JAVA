package Herencia;

//clase Hija/Heredada(lavadora) de electrodomestico
public class lavadora extends electrodomestico{
	//atributos
	private double carga;
	double precio;
	
	//Constructor atributos por defecto
	public lavadora() {
		this.carga = 5;
	}
		
	//Constructor con los atributos heredados de electrodomestico
	public lavadora(double precioBase, char consumo, String color, double peso, double carga) {
		//los hereda de electrodomestico
		super(precioBase,consumo,color,peso);
		this.carga = carga;
	}
	
	public double precioFinal(double carga, double precioBase) { //calculamos el precio final aprovechando la herencia
		if (carga>30) { //si pesa mas de 30 se aumenta el precio, al no ser así no.
			precioBase=precioBase+50;
		}
		return precioBase;
	}
	
	public void mostrarDatos() {//Usamos los get porque está en private y al ser hija no lo pilla, podriamos cambiarlo a protected pero no
		System.out.println("Precio Base: "+ precioFinal(carga,getPrecioBase())+
				"\nConsumo: "+getConsumo()+
				"\nColor: "+getColor()+
				"\nPeso: "+getPeso()+
				//no hace falta poner get ya que estamos en la misma clase
				"\nCarga: "+ carga+"\n");
	}
	
	public double precio() { //hacemos este metodo para sacarlo fuera del programa 
		precio=(double) precioFinal(carga,getPrecioBase());
		return precio;
	}
	
	public static void main(String[] args) {
		//creamos una lavadora default
		lavadora defecto = new lavadora();
		//comprobamos la herencia con los default de electrodomestico y lavadora, funciona correctamente
		defecto.mostrarDatos();
		System.out.println();
			
		lavadora kilian = new lavadora(600,'A',"Negro",70.3,31); //creamos una lavadora con mi nombre y características
		kilian.mostrarDatos();//mostramos los datos de la nueva lavadora
	 }
}
