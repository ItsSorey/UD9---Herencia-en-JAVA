package Herencia;

public class serie {
	//Atributos de la clase
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public serie() {//contructor atributos por defecto
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	public serie(String titulo, String creador) {//contructor titulo y creador
		this.titulo = titulo;
		this.creador = creador;	
	}
	
	//Constructor todos atributos
	public serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Métodos get de todos los atributos
	public String getTitulo() {return titulo;}
	public int getNumeroTemporadas() {return numeroTemporadas;}
	public String getGenero() {return genero;}
	public String getCreador() {return creador;}
	
	public void mostrarDatos() { //mostramos los datos
		System.out.println("Titulo: "+ getTitulo()+
				"\nNumero Temporadas: "+getNumeroTemporadas()+
				"\nGenero: "+getGenero()+
				"\nCreador: "+getCreador());
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
        int estado=1; // 1 Menor
        
        serie ref=(serie)a;//Casting de objetos
        if (numeroTemporadas>ref.getNumeroTemporadas()){
            estado=2; // 2 Mayor
        }else if(numeroTemporadas==ref.getNumeroTemporadas()){
            estado=3; // 3 Igual
        }
        return estado;
    }
	
	public static void main(String[] args) {
		//generamos una serie default
		serie defecto = new serie();
		defecto.mostrarDatos();
		System.out.println();
			
		serie kilian = new serie("Kilian Martin",4,"Terror","T-Sysems");//creamos
		
		kilian.mostrarDatos();//mostramos los datos 
	 }
}