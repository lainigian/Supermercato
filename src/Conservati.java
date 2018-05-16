
public class Conservati extends Alimentari implements Cloneable
{

	private String marca;
	
	

	public Conservati(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie, String marca) 
	{
		super(codice, prezzoUnitario, descrizione, peso, calorieUnitarie);
		
		setMarca(marca);
		
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public Conservati clone() throws CloneNotSupportedException 
	{
		Conservati conservati;
		conservati=new Conservati(getCodice(), getPrezzoUnitario(), getDescrizione(), getPeso(), getCalorieUnitarie(), getMarca());
		return conservati;
	}
	
	public String toString()
	{
		String risultato=super.toString();
		risultato+=" marca: "+getMarca()+ " prezzo: "+calcolaImporto();
		return risultato;
	}
}
