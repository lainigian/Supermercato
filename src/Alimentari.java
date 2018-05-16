
public abstract class Alimentari extends Merce
{

	
	private String descrizione;
	private double peso;
	private double calorieUnitarie;
	
	
	public Alimentari(String codice, double prezzoUnitario, String descrizione, double peso, double calorieUnitarie)
	{
		super(codice, prezzoUnitario);
		setDescrizione(descrizione);
		setPeso(peso);
		setCalorieUnitarie(calorieUnitarie);
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCalorieUnitarie() {
		return calorieUnitarie;
	}
	public void setCalorieUnitarie(double calorieUnitarie) {
		this.calorieUnitarie = calorieUnitarie;
	}

	@Override
	public double calcolaImporto() 
	{
		return getPrezzoUnitario()*getPeso();
	}

	public double calcolaCalorie()
	{
		return peso*calorieUnitarie;		
	}
	
	@Override
	public abstract Alimentari clone() throws CloneNotSupportedException;
	
	public String toString()
	{
		return (super.toString()+" descrizione: "+getDescrizione()+ " peso: "+ getPeso()+ " kg Calorie: "+calcolaCalorie());
	}
	
	
}
