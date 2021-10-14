public class JugadorBrisca
{
	
	private int puntos;
	private CartaBrisca[] brj=new CartaBrisca[3];
	
	//CONSTRUCTOR
	
	public JugadorBrisca()
	{
		puntos=0;
		
	}
	
	//GETTERS SETTERS
	
	public int getPuntos()
	{
		return puntos;
		
	}
	
	public CartaBrisca getCarta(int i)
	{
		
		return brj[i];
	}
	
	
	public void setPuntos(int puntos)
	{
		this.puntos=puntos;
		
	}
	
	public void setCarta(CartaBrisca c)
	{
		for(int i=0;i<3;i++)
		{
			if(brj[i]==null)brj[i]=c;
		    //break;    
		}
			
			
			
			
		
		
	}
	
	/////OTROS METODOS
	
		public void llenarMano(CartaBrisca c,int i)
	{
			
			brj[i]=c;	
		
	}
	
	public CartaBrisca usarCarta(int i)
	{
		CartaBrisca c=brj[i];
		brj[i]=null;
		reordenarCarta();
		return c;
		
	}
	
	
	public boolean barajaLlena()
	{
		for(int i=0;i<3;i++)
		{
			if(brj[i]!=null) return true;
		}
		return false;
	}
	
	public void reordenarCarta()
	{
		for(int i=0;i<2;i++)
		{
			if(brj[i]==null && brj[i+1]!=null){brj[i]=brj[i+1]; brj[i+1]=null;}
		}
	}
	
	@Override
	public String toString()
	{
		String mano="";
		for(int i=0;i<3;i++)
		{
			if(brj[i]!=null)mano+=(i+1)+". "+brj[i]+"\n";
		}
		
		return mano;
	}
	
}