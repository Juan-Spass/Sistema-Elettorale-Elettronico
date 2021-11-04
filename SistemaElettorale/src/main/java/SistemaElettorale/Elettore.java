package SistemaElettorale;

public class Elettore extends Persona{
	         public Elettore(String nome, String cognome, String usr, String psw) {
	        	 super(nome, cognome, usr, psw);
	         }
             public void TornaSpid() {
            	 if(nome!=null && cognome!=null)
            	 System.out.println("SPID");
             }
}
