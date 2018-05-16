
public class Carrello 
{
	private static final int MAX_NUMERO_OGGETTI=100;
	private int oggetti;
	private Merce[] contenutoCarrello;
	
	public Carrello ()
	{
		contenutoCarrello=new Merce[MAX_NUMERO_OGGETTI];
		oggetti=0;
	}
	
	public void inserisciProdotto(Merce prodotto)
	{
		try
		{
			if (oggetti<MAX_NUMERO_OGGETTI)
			{
				contenutoCarrello[oggetti]=prodotto.clone();
				oggetti++;
			}
				
		} 
		catch (CloneNotSupportedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double calcolaPrezzoTotale()
	{
		double totale=0;
		for (int i = 0; i <MAX_NUMERO_OGGETTI; i++) 
		{
			if (contenutoCarrello[i]!=null)
			{
				totale+=contenutoCarrello[i].calcolaImporto();
			}
		}
		return totale;			
	}
	
	public double calcolaCalorieTotali()
	{
		double totale=0;
		for (int i = 0; i <MAX_NUMERO_OGGETTI; i++) 
		{
			if (contenutoCarrello!=null)
			{
				if (contenutoCarrello[i] instanceof Alimentari)
				totale+=((Alimentari)contenutoCarrello[i]).calcolaCalorie();
			}
		}
		return totale;			
	}
	
	public Merce[] esportaContenuto()
	{
		Merce[] contenuto=new Merce[oggetti];
		for (int i = 0; i < oggetti; i++) 
		{
			if (contenutoCarrello[i]!=null)
			{
				try 
				{
					contenuto[i]=contenutoCarrello[i].clone();
				} 
				catch (CloneNotSupportedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		return contenuto;
	}
	
	public String toString()
	{
		String risultato="";
		for (int i = 0; i <MAX_NUMERO_OGGETTI; i++) 
		{
			if (contenutoCarrello[i]!=null)
			{
				risultato+=contenutoCarrello[i].toString()+"\n";
			}
		}
		return risultato;
	}
}
