

public class Mainer2
{
	public static void main(String args[])
	{
		
		
		CartaBrisca c1=new CartaBrisca(3,"oros");
		CartaBrisca c2=new CartaBrisca(6,"oros");
		CartaBrisca c3=new CartaBrisca(1,"espadas");
		CartaBrisca c4=new CartaBrisca(3,"bastos");
	
		System.out.println(CartaBrisca.ganaPrimeraCarta(c2,c1,1));
		System.out.println(CartaBrisca.ganaPrimeraCarta(c1,c2,1));
		System.out.println(CartaBrisca.ganaPrimeraCarta(c2,c3,1));//oros/espadas/bastos -- true
		System.out.println(CartaBrisca.ganaPrimeraCarta(c2,c4,0));//oros/bastos/bastos --- false
		System.out.println(CartaBrisca.ganaPrimeraCarta(c1,c3,2));//oros/bastos/bastos --- false
		
		
	}
}