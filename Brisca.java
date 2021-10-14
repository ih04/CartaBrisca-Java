import java.util.Random;
import java.util.Scanner;

public class Brisca
{
	Scanner ent=new Scanner(System.in);
	
		//JUGADORES
		
		
	public JugadorBrisca j1;
	public JugadorBrisca j2;
	
	//cartas de los jugadores
	
	public CartaBrisca c1;
	public CartaBrisca c2;
	
	public BarajaESP brj;
	
	public int muestra=0;
	public String m;
	public int turno;
	
	   ////////CONSTRUCTOR!!!
	   
	public Brisca()
	{	
		//los jugadores
		this.j1=new JugadorBrisca();
		this.j2=new JugadorBrisca();
		
		//turnos
		if(Math.random()<0.5){turno=1;}else{turno=2;}
		
		brj=new BarajaESP();
		
		//barajo
		brj.barajar();
		
		//reparto
		
		for(int i=0;i<3;i++)
		{
			j1.llenarMano(brj.sacaCarta(),i);
			j2.llenarMano(brj.sacaCarta(),i);
		}
		
		int p=-1; 
		if(brj.getMuestra().equalsIgnoreCase("bastos"))p=0;
		if(brj.getMuestra().equalsIgnoreCase("copas"))p=1;
		if(brj.getMuestra().equalsIgnoreCase("espadas"))p=2;
		if(brj.getMuestra().equalsIgnoreCase("oros"))p=3;
		
		
	    if(p>=0){muestra=p;}else{throw new IllegalArgumentException("El palo de la muestra no da lo suyo!!!!!!!!!!!!!!!!");}
		m=brj.getMuestra();
		
	}
	
	public BarajaESP getBrj(){return brj;}
	
	///////////////////------------los 2 jugadores
	
	public void vaJ1()
	{
		System.out.println("Va el ordenador!");
				
				if(j1.barajaLlena()==true)
				{
					do{
						c1=j1.usarCarta(azar());
					}while(c1==null);
					
					System.out.println("");
					System.out.println("El ordenador ha sacado un "+c1);
					System.out.println("");
				}
	}	
	
	
	
	public void vaJ2()
	{
				System.out.println("Va el jugador!");
				//if(c!=null){System.out.println("")}
				System.out.println("");
				
				System.out.println("La muestra es "+m);
				//System.out.println("La muestra es "+bri.muestra);
				System.out.println("");
				System.out.println("Las cartas del jugador son \n"+j2.toString());
				System.out.println("");
				System.out.println("Elige una de las cartas: ");
				
				
				c2=j2.usarCarta(ent.nextInt()-1);
				
				
	}
	
	//---------------*******metodo para sacar numeros aleatorios
	
	//public int length(){return brj.baraja.length;}
	
	public static int azar()
	{ 
		int num;
		do{
			num= (int)(Math.random()*10);
			//if(num<41){num;}
		}
		while(num>2 || num <0);
		
		return num;
	}
}