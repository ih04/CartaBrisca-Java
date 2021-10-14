public class Carta
{
	//variables
	private int valor;
	private String palo;
	
	//constructor
	
	public Carta(int valor, String palo)
	{
		if(valor>=1 && valor<=12 && (palo.equalsIgnoreCase("bastos") || palo.equalsIgnoreCase("copas") || palo.equalsIgnoreCase("espadas") || palo.equalsIgnoreCase("oros")) )
		{
		this.valor=valor;
		this.palo=palo;
		}else
		{
			throw new IllegalArgumentException("Valor no valido!!");
		}
		
	}
		
	//getters
	
	public int getValor(){return valor;}
	
	public String getPalo(){return palo;}
	
	//toString
	
	@Override
	public String toString()
	{
			switch(valor)
			{
				case 1:
					return "AS de "+palo;
				case 3:
					return "TRES de "+palo;
				
				case 10:
					return "SOTA de "+palo;
				
				case 11:
					return "CABALLO de "+palo;
				
				case 12:
					return "REY de "+palo;
				
				default:
					return ""+valor+" de "+palo;
				
			}
		
	}
	
}