package Herencia;

public class libro {
	//atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    //Constructor todos atributos
  	public libro(int ISBN, String titulo, String autor, int numPaginas) {
  		this.ISBN = ISBN;
  		this.titulo = titulo;
  		this.autor = autor;
  		this.numPaginas = numPaginas;
  	}
    
    //Métodos get de todos los atributos
  	public int getISBN() {return ISBN;}
  	public String getTitulo() {return titulo;}
  	public String getAutor() {return autor;}
  	public int getNumPaginas() {return numPaginas;}
     
  	public void mostrarDatos() { //mostramos los datos
		System.out.println("El libro con ISBN: "+ getISBN()+
				"\ncreado por "+getAutor()+
				" tiene "+getNumPaginas()+" páginas\n");
	}
  	
  	public int compareTo(Object a) {
        int estado=1; //1 Menor
        
        libro ref=(libro)a;//Casting de objetos
        if (numPaginas>ref.getNumPaginas()){
            estado=2; // 2 Mayor
        }else if(numPaginas==ref.getNumPaginas()){
            estado=3; // 3 Igual
        }
        return estado;
    }
  	
  	public static void main(String[] args) {
  		//creamos los libros
  		libro Crimen = new libro(2267,"Crimen","Leonardo",240);
  		libro HarryPotter = new libro(145,"Harry Potter","JK Rowling",460);
  		
  		//mostramos los datos
  		Crimen.mostrarDatos();
  		HarryPotter.mostrarDatos();
  		
  		//Creamos una variable mayor donde asignamos el primer libro
  		libro libroMayor=Crimen;
  		
  		if(HarryPotter.compareTo(libroMayor)==2){//comparamos los 2 libros
   		 //con el 2 ya que el 2 es el Mayor
  			libroMayor=HarryPotter;
  		}
  		System.out.println("Libro con más páginas:");
  		libroMayor.mostrarDatos();
  	}
}
     
     
     