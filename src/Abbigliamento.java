
public class Abbigliamento extends Merce

{
	private static double scontoUomo=5;
	private static double scontoDonna=10;
	private char sesso;
	private String taglia;
	private String tipologia;
	
	public Abbigliamento (String codice, double prezzoUnitario, char sesso, String taglia, String tipologia)
	{
		super(codice, prezzoUnitario);
		setSesso(sesso);
		setTaglia(taglia);
		setTipologia(tipologia);
	}

	public static double getScontoUomo() {
		return scontoUomo;
	}

	public static void setScontoUomo(double scontoUomo) {
		Abbigliamento.scontoUomo = scontoUomo;
	}

	public static double getScontoDonna() {
		return scontoDonna;
	}

	public static void setScontoDonna(double scontoDonna) {
		Abbigliamento.scontoDonna = scontoDonna;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public double calcolaImporto() 
	{
		if (getSesso()=='M')
			return (getPrezzoUnitario()*(1-getScontoUomo()/100));
		else
			return (getPrezzoUnitario()*(1-getScontoDonna()/100));
	}

	@Override
	public Abbigliamento clone() 
	{
		Abbigliamento a = new Abbigliamento(getCodice(),getPrezzoUnitario(),getSesso(),getTaglia(),getTipologia());
		return a;
	}
	
	public String toString()
	{
		return (super.toString()+" Tipologia: "+getTipologia()+" Sesso "+getSesso()+" Taglia: "+getTaglia()+ "prezzo: "+calcolaImporto());
	}
	
}
