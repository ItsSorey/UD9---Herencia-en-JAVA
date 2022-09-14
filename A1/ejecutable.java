package Herencia;

public class ejecutable {	
	public static void main(String [] args) {
		television arrayTele[]=new television[5];
		lavadora arrayLavadora[]=new lavadora[5];
		
		//Televisiones
		arrayTele[0]=new television(1000,'A',"Negro",70.3,41, true);
		arrayTele[1]=new television(500,'B',"Gris",70.3,20, false); 
		arrayTele[2]=new television(2000,'A',"Negro",70.3,70, true); 
		arrayTele[3]=new television(300,'C',"Blanco",70.3,51, false); 
		arrayTele[4]=new television(3000,'A',"Negro",70.3,90, true); 
		
		double sumaTele = 0; 
		for(int i=0;i<arrayTele.length;i++) {
			 sumaTele+=arrayTele[i].precio();//suma succesiva para conseguir el precio de cada objeto
		}
		System.out.println("Precio de los Televisores: "+sumaTele+"€");
		
		//Lavadoras
		arrayLavadora[0]= new lavadora(800,'B',"Negro",70.3,37); 
		arrayLavadora[1]= new lavadora(600,'D',"Negro",30,31); 
		arrayLavadora[2]= new lavadora(1000,'A',"Blanco",70.3,10);
		arrayLavadora[3]= new lavadora(100,'C',"Negro",90.3,31);
		arrayLavadora[4]= new lavadora(700,'B',"Negro",70.3,31);
		
		double sumaLava = 0;
		for(int i=0;i<arrayLavadora.length;i++) {
			sumaLava+=arrayLavadora[i].precio(); //suma succesiva para conseguir el precio de cada objeto
		}
		System.out.println("Precio de las Lavadoras: "+sumaLava+"€");
		
		System.out.println("Suma total: "+(sumaLava+sumaTele)+"€");
	}
}