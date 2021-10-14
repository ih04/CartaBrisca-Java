import java.util.Scanner;

public class Mainer
{
	public static void main(String args[])
	{	
		Scanner ent=new Scanner(System.in);
		
		
		Brisca bri=new Brisca();
		System.out.println("--------------BRISCA ESP----------------");
		while(bri.j1.barajaLlena()==true && bri.j2.barajaLlena()==true)
		{
			boolean ganapc=false,gana1=false,gana2=true;
			
			if(bri.turno%2!=0)
			{
				bri.vaJ1();
				System.out.println("--------------------------------------------------------------");
				bri.vaJ2();
				System.out.println("El jugador ha sacado un "+bri.c2);
				System.out.println("--------------------------------------------------------------");
				gana1=CartaBrisca.ganaPrimeraCarta(bri.c1,bri.c2,bri.muestra);
				
			}else
			{
				bri.vaJ2();
				System.out.println("--------------------------------------------------------------");
				bri.vaJ1();
				System.out.println("--------------------------------------------------------------");
				gana2=CartaBrisca.ganaPrimeraCarta(bri.c2,bri.c1,bri.muestra);
				
			}
			
			if(bri.turno==1 && gana1==true)ganapc=true;
			if(bri.turno==2 && gana2==false)ganapc=true;
			
			int ptos=bri.c1.getPuntos()+bri.c2.getPuntos();
			System.out.println((ganapc==true)?"!!!!!!El pc se lleva "+ptos+" puntos!!!!!!!":"!!!!!El jugador se lleva "+ptos+" puntos!!!!!!");
			System.out.println("");
			
			if(ganapc==true){bri.turno=1; bri.j1.setPuntos(bri.j1.getPuntos()+ptos);}else{bri.turno=2; bri.j2.setPuntos(bri.j2.getPuntos()+ptos);}
			//a quien le toca robar carta?
		    //System.out.println(bri.brj.length);
			if(bri.getBrj().hayCartas()==true){	
				if(ganapc==true)
				{
					
						System.out.println("el pc ha robado una carta");
						bri.j1.setCarta(bri.getBrj().sacaCarta());
						System.out.println("El jugador ha robado una carta");
						bri.j2.setCarta(bri.getBrj().sacaCarta());
					
				}else{
					
						System.out.println("El jugador ha robado una carta");
						bri.j2.setCarta(bri.getBrj().sacaCarta());
						System.out.println("el pc ha robado una carta");
						bri.j1.setCarta(bri.getBrj().sacaCarta());
					
				}
			}else{
				
				System.out.println("El jugador 1 ha ganado "+bri.j2.getPuntos()+" puntos!!!!!!!!!");
				System.out.println("El ordenador ha ganado "+bri.j1.getPuntos()+" puntos!!!!!!!!!");
				if(bri.j1.getPuntos()!=bri.j2.getPuntos())
				{
					if(bri.j2.getPuntos()>bri.j1.getPuntos())
					{
						System.out.println("!!!!!!!!!!!!!!!Gana el jugador 1 con "+bri.j2.getPuntos()+" puntos!!!!!!!!!");
					}else{	System.out.println("!!!!!!!!!!!!!!!Gana el ordenador con "+bri.j1.getPuntos()+" puntos!!!!!!!!!");}
				
				}else{System.out.println("!!!!!!!!!!!!!EMPATE!!!!!!!!!!!!!!");}
				
				/*
				if( bri.j1.getPuntos()!=bri.j1.getPuntos()){
				System.out.println((bri.j1.getPuntos()>bri.j2.getPuntos())?"!!!!GANA LA MAQUINA CON "+bri.j1.getPuntos()+" puntos":"!!!!GANA EL HUMANO CON  "+bri.j2.getPuntos()+" puntos");
				
				System.out.println("La baraja está vacía!");}
				else{System.out.println("empate!!!!!!!!!!");}
			*/}
			//System.out.println(bri.j1.getCarta(1));
		
		
		}
		
		
	}
	
	
	
	
}