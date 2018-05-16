
public class MainClass 
{

	public static void main(String[] args) 
	{
		Abbigliamento a1= new Abbigliamento("PU01", 50, 'M', "XL", "Pantaloni");

		Abbigliamento a2=new Abbigliamento("CD22",35,'F',"XS","Camicia");
		
		Abbigliamento a3=new Abbigliamento("GD46",29,'F',"S","Giacca");
		
		Freschi f1=new Freschi("OR044",1.5,"Peperoni",1.4,170,true);
		Freschi f2=new Freschi("FR012",1.9,"Mele",0.5,730,false);
		
		Conservati c1= new Conservati("BS003",2,"Biscotti",0.37,1200,"Buoni e belli");
		
		Carrello c=new Carrello();
		c.inserisciProdotto(a1);
		c.inserisciProdotto(a2);
		c.inserisciProdotto(a3);
		c.inserisciProdotto(f1);
		c.inserisciProdotto(f2);
		c.inserisciProdotto(c1);
		
		System.out.println(c.toString());
		System.out.println("Calorie totali "+c.calcolaCalorieTotali());
		System.out.println("Totale spesa " +c.calcolaPrezzoTotale());
		
	}

}
