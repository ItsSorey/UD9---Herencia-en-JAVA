package Herencia;

public class videojuego {
	//Atributos de la clase
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	public videojuego() {//contructor atributos por defecto
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compa�ia = "";
	}
	
	public videojuego(String titulo, int horasEstimadas) {//contructor titulo y horasEstimadas
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;	
	}
	
	//Constructor todos atributos
	public videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	
	//M�todos get de todos los atributos
	public String getTitulo() {return titulo;}
	public int getHorasEstimadas() {return horasEstimadas;}
	public String getGenero() {return genero;}
	public String getCompa�ia() {return compa�ia;}
	
	public void mostrarDatos() { //mostramos los datos
		System.out.println("Titulo: "+ getTitulo()+
				"\nHoras Estimadas: "+getHorasEstimadas()+
				"\nGenero: "+getGenero()+
				"\nCompa�ia: "+getCompa�ia());
	}
	
	public void entregar() {
		entregado=true;
	}
	public void devolver() {
		entregado=false;
	}
	public boolean isEntregado() {
		if(entregado) {
			entregado=true;
		}
		else {
			entregado=false;
		}
		return entregado;
	}
	
	public int compareTo(Object a) {
        int estado=1; //1 Menor
        
        videojuego ref=(videojuego)a;//Casting de objetos
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=2; // 2 Mayor
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=3; // 3 Igual
        }
        return estado;
    }
	
	public static void main(String[] args) {
		//generamos un videojuego default
		videojuego defecto = new videojuego();
		defecto.mostrarDatos();
		System.out.println();
			
		videojuego kilian = new videojuego("Kilian Martin",100,"Acci�n","T-Sysems");//creamos
		
		kilian.mostrarDatos();//mostramos los datos
	 }
}