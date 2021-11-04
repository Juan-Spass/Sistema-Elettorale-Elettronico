package SistemaElettorale;

public class Persona {
       protected String nome;
       protected String cognome;
       protected String username;
       protected String password;
       
       public Persona(String nome, String cognome, String usr, String psw) {
    	   
    	   if(ControllaPassword(psw)) {
    		   this.nome=nome;
        	   this.cognome=cognome;
        	   this.username=usr;
    		   this.password=psw;
    	   }else {
    		   System.out.println("password non valida");
    	   }
    	  
       }
       
       private static boolean ControllaPassword(String psw) {
    	   if(psw.length()<8) {
    		   return false;
    	   }
    	   return true;
       }
}
