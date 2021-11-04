package SistemaElettorale;

public class TestSistema {
       public static void main(String[] args) {
    	   Elettore el= new Elettore("Juanito", "Yaraschino", "xy", "12345678");
    	   el.TornaSpid();
    	   Elettore el2= new Elettore("Fjorenta", "Barja", "xx", "1234567");
    	   el2.TornaSpid();
       }
}
