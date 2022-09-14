package Herencia;

public class entregable {
	 public static void main(String[] args) {
		 //atributos
	     serie series[]=new serie[5];
	     videojuego videojuegos[]=new videojuego[5];
	     int entregados = 0;
	     
	     //Series
	     series[0]=new serie("Doraemon",15,"Futurista","Japon");
	     series[1]=new serie("Cars",2,"Comedia","Cors"); 
	     series[2]=new serie("Alma",30,"Terror","Nive"); 
	     series[3]=new serie("El barco",3,"Suspense","Nomi"); 
	     series[4]=new serie("The Rain",2,"Acción","Marto"); 
	     
	     //Viodeojuegos
	     videojuegos[0]=new videojuego("Lol",10,"MMORPG","Riot");
	     videojuegos[1]=new videojuego("juego2",2,"Acción","Mirto"); 
	     videojuegos[2]=new videojuego("IdleRPG",20,"Idle","Pepo"); 
	     videojuegos[3]=new videojuego("Lol3",1,"Suspense","Nomi"); 
	     videojuegos[4]=new videojuego("Kiko",1,"Acción","Rome");
	     
	     //entregamos videojuegos y series
	     series[0].entregar();
	     series[1].entregar();
	     videojuegos[0].entregar();
	     videojuegos[2].entregar();
	     
	     //Miramos los entregados y tambien los devolvemos
	     for(int i=0;i<series.length;i++){
	    	 if(series[i].isEntregado()){
	    		 entregados+=1;
	    		 series[i].devolver();
	    	 }
	    	 if(videojuegos[i].isEntregado()){
	    		 entregados+=1;
	    		 videojuegos[i].devolver();
	    	}
	     }
	     System.out.println("Hay "+entregados+" entregados\n");
	     
	     //Creamos los una variable de Mayor
	     serie serieMayor=series[0];
	     videojuego videojuegoMayor=videojuegos[0];
	     
	     //Recorremos y comparamos con todo el Vector
	     for(int i=1;i<series.length;i++){
	    	 if(series[i].compareTo(serieMayor)==2){//comparamos toda la lista de series 
	    		 //con el 2 ya que el 2 es el Mayor
	    		 serieMayor=series[i];
	    	 }
	    	 if(videojuegos[i].compareTo(videojuegoMayor)==2){
	    		 videojuegoMayor=videojuegos[i];
	         }
	     }
	     //Serie y Videojuego mayor:
	     serieMayor.mostrarDatos();
	     System.out.println();
	     videojuegoMayor.mostrarDatos();
	 }
}
