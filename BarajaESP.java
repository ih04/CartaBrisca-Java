import java.lang.Math;

public class BarajaESP 
{
	private CartaBrisca baraja[]=new CartaBrisca[40];
	private int saCarta;
	//CONSTRUCTOR
	
	public BarajaESP()
	{	
	//int cont=0;	//para referirnos a la posicion
		String val="";
		saCarta=baraja.length-1;
		int cont=0;
		//(AS, 2, 3, 4, 5, 6, 7, sota, caballo y rey) de cada palo (bastos, copas, espadas y oros).
		
		
		
		for(int i=0;i<4;i++)
		{	
			for(int j=1;j<13;j++){
			//condiciones i
			if(i==0)val="bastos";
			if(i==1)val="copas";
			if(i==2)val="espadas";
			if(i==3)val="oros";
			
			///condiciones j
			if(j==8)j=10;
			
			
			baraja[cont]=new CartaBrisca(j,val);
			
			cont++;
			}
		}
		
	}
	
	
	//METS
	public void barajar()
	{	CartaBrisca c;
		for(int i=0;i<baraja.length;i++){
			int num=0;
			do{
				num= (int)(Math.random()*100);
				//if(num<41){num;}
			}while(num>39);
			
			
			//intercambio
			c=baraja[i];
			baraja[i]=baraja[num];
			baraja[num]=c;
		
		}
		
		
		
	}
		
	public CartaBrisca sacaCarta()
	{
		CartaBrisca bar;
		if(baraja.length>0 && saCarta>=0)
		{
			 bar=baraja[saCarta];
			baraja[saCarta]=null;
			saCarta--;
			return bar;
		}else{
			throw new IllegalArgumentException("Baraja vacia!!!!!!!!!!!!!!!!!!!!!!!"); 
			
		}
		
	
	}
	
	
	
	public String dimeCarta(int i)
	{
		if(baraja[i]!=null)return baraja[i].toString();
		return null;
		
	}
	
	public boolean hayCartas()
	{
		if(baraja[0]==null)return false;
		return true;
	}
	
	@Override
	public String toString()
	{	String mazo="";
		for(int i=0;i<baraja.length;i++)
		{	
		
			if(baraja[i]!=null)mazo+=baraja[i].toString()+", ";
			
		}
		return mazo;
	}
	
	///////metodos aparte
	
	public CartaBrisca[] getBarajaESP()
	{
		return baraja;
	}
	
	public int getSacarta(){return saCarta;}
	
	public String getMuestra()
	{
		if(hayCartas()==true)	return baraja[0].getPalo();
		return "";
	}
	
	
}