package Herencia;

public class electrodomestico {
	//Atributos de la clase
	private double precioBase;
	private char consumo;
	private double peso;
	private String color;
	
	public electrodomestico() {//contructor atributos por defecto
		this.precioBase = 100;
		this.consumo = 'F';
		this.color = "Blanco";
		this.peso = 5;
	}
	
	public electrodomestico(double precioBase, double peso) {//contructor precio y peso, resto por defecto
		this.precioBase = precioBase;
		this.peso = peso;	
	}
	
	//Constructor todos atributos
	public electrodomestico(double precioBase, char consumo,String color, double peso) {
		this.consumo = comprobarConsumoEnergetico(consumo);
		this.color = comprobarColor(color);
		this.peso = peso;
		this.precioBase = precioFinal(precioBase, consumo, peso);
	}
	
	//Métodos get de todos los atributos
	public double getPrecioBase() {return precioBase;}
	public char getConsumo() {return consumo;}
	public String getColor() {return color;}
	public double getPeso() {return peso;}
	
	public char comprobarConsumoEnergetico(char consumo) { //comprueba que la letra es correcta ignorando mayusculas/min, sinó letra por defecto
		if (Character.toLowerCase(consumo)!='a'&&Character.toLowerCase(consumo)!='b'&&Character.toLowerCase(consumo)!='c'
				&&Character.toLowerCase(consumo)!='d'&&Character.toLowerCase(consumo)!='e') {
			consumo='F';
		}
		return consumo;
	}
	
	public String comprobarColor(String color) { //comprueba que los colores son correctos ignorando mayuscula y minuscula, sinó color por defecto
		if (color.toLowerCase()!="blanco"&&color.toLowerCase()!="negro"&&color.toLowerCase()!="rojo"&&color.toLowerCase()!="azul"&&color.toLowerCase()!="gris") {
			color="blanco";
		}
		return color;
	}
	
	public double precioFinal(double precioBase, char consumo, double peso) { //calculamos el precio final
		if (Character.toLowerCase(consumo)=='a') { //calculamos el precio según el consumo
			precioBase = precioBase+100;
		}
		else if (Character.toLowerCase(consumo)=='b') {
			precioBase = precioBase+80;
		}
		else if (Character.toLowerCase(consumo)=='c') {
			precioBase = precioBase+60;
		}
		else if (Character.toLowerCase(consumo)=='d') {
			precioBase = precioBase+50;
		}
		else if (Character.toLowerCase(consumo)=='e') {
			precioBase = precioBase+30;
		}
		else {
			precioBase = precioBase+10;
		}
		
		if (peso>=0&&peso<=19) { //calculamos el precio según el tamaño
			precioBase = precioBase+10;
		}
		else if (peso>19&&peso<=49) {
			precioBase = precioBase+50;
		}
		else if (peso>49&&peso<=79) {
			precioBase = precioBase+80;
		}
		else {
			precioBase = precioBase+100;
		}
		
		return precioBase;
	}
	
	public void mostrarDatos() { //mostramos los datos
		System.out.println("Precio Base: "+ getPrecioBase()+
				"\nConsumo Energetico: "+getConsumo()+
				"\nColor: "+getColor()+
				"\nPeso: "+getPeso());
	}
	
	public static void main(String[] args) {
		//generamos un electordomestico default
		electrodomestico defecto = new electrodomestico();
		defecto.mostrarDatos();
		System.out.println();
			
		electrodomestico kilian = new electrodomestico(700,'A',"Negro",70.3); //creamos un electrodomestico con mi nombre y caracteristicas
		
		kilian.mostrarDatos();//mostramos los datos del nuevo electrodomestico
	 }
}