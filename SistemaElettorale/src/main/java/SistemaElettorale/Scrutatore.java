package SistemaElettorale;

public class Scrutatore extends Persona{
	private String spid;
	public Scrutatore(String nome, String cognome) {
   	 super(nome, cognome);
    }
    public void Dati() {
   	 System.out.println(nome + " "+ cognome);
    }
}
