public class CartaBrisca extends Carta
{
	//VARIABLE
	private int puntos;
	
	//CONSTRUCTORES
	
	public CartaBrisca(int valor, String palo)
	{
		super(valor,palo);
		puntos=0;
		switch(valor)
		{
			case 1:
				puntos=11;
				break;
			case 3:
				puntos=10;
				break;
			case 10:
				puntos=2;
				break;
			case 11:
				puntos=3;
				break;
			case 12:
				puntos=4;
				break;
			default:
				puntos=0;
				
			
		}
		
	}
	
	//GETTERS
	
	public int getPuntos(){return puntos;}
	
	//METS
	
	
	
	
	public static  boolean  ganaPrimeraCarta(CartaBrisca prim, CartaBrisca seg, int muestra)  
	{
		 String mstr;
		 switch(muestra)
		 {
			 case 0:
				mstr="bastos";
				break;
			 case 1:
				mstr="copas";
				break;
		   	case 2:
				mstr="espadas";
				break;
			case 3:
				mstr="oros";
				break;
			default:
				mstr="";
		 }
		 
		//CASO1
		
		if(prim.getPalo().equalsIgnoreCase(seg.getPalo()))
		{
			  if(prim.getValor()==1  ) return true;                                            
			  if(prim.getValor()==3 && seg.getValor()!=1) return true;
			  if(prim.getValor()>seg.getValor() && seg.getValor() != 1 && seg.getValor() != 3) return true;
					
		}
		
			//CASO2 
			
			//La primera carta es el mismo palo que la muestra
			if(prim.getPalo().equalsIgnoreCase(mstr) && !seg.getPalo().equalsIgnoreCase(mstr)) return true;
			
			//CASO 3
			
			
			
			if(!(prim.getPalo().equalsIgnoreCase(mstr)) && !(seg.getPalo().equalsIgnoreCase(mstr)) && !(prim.getPalo().equalsIgnoreCase(seg.getPalo()))) return true;
			
			return false;
			
			
	}
}