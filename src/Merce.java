
abstract public class Merce 
{
	
	private String codice;
	private double prezzoUnitario;
	
	public Merce(String codice, double prezzoUnitario)
	{
		setCodice(codice);
		setPrezzoUnitario(prezzoUnitario);
	}
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}
	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public String toString()
	{
		return ("Codice: "+getCodice()+ " Prezzo unitario: "+prezzoUnitario);
	}

	public abstract double calcolaImporto();
	
	public abstract Merce clone() throws CloneNotSupportedException;
}
