
public class Freschi extends Alimentari implements Cloneable
{

	private static double costoSacchetto=0.05;
	private boolean confezionato;
	
	public Freschi(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, boolean confezionato) 
	{
		super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
		setConfezionato(confezionato);;
		
	}

	
	
	
	public static double getCostoSacchetto() {
		return costoSacchetto;
	}
	public static void setCostoSacchetto(double costoSacchetto) {
		Freschi.costoSacchetto = costoSacchetto;
	}

	
	public boolean isConfezionato() {
		return confezionato;
	}


	public void setConfezionato(boolean confezionato) {
		this.confezionato = confezionato;
	}


	public double calcolaImporto()
	{
		if (!isConfezionato())
			return super.calcolaImporto()+costoSacchetto;
		else 
			return (super.calcolaImporto());
	}
	
	public String toString()
	{
		String risultato=super.toString();
		
		if (confezionato)
			risultato+=" preconfezionato ";
		else
			risultato+=" sfuso ";
		risultato+=" prezzo: "+calcolaImporto();
		return risultato;
		
	}

	@Override
	public Freschi clone()
	{
		Freschi f=new Freschi(getCodice(), getPrezzoUnitario(), getDescrizione(), getPeso(), getCalorieUnitarie(), isConfezionato());
		return f;
	}
	
	
}
