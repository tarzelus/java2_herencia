import java.util.Hashtable;

public class Main {
	public static void main (String [ ] Args) {
	        Museo museo = new Museo ();
	        museo.setTipoMuseo("Museo");
	        museo.setNombreMuseo("San Telmo museoa");
	        museo.setIdMuseo(1);

	        
	        System.out.print("--- Museo: ");
	        System.out.print("\nTipo: " + museo.getTipoMuseo());
	        System.out.print("\Nombre: " + museo.getNombreMuseo());
	        System.out.print("\nId: " + museo.getIdMuseo());


	        Iglesia iglesia = new Iglesia();
	        iglesia.setNombreIglesia("Buen Pastor");
	        iglesia.setIdIglesia(2);
	        iglesia.setTipoIglesia("catedral");

	        
	        //Hashtable

	        Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();

	        otrosEspacios.put("Barrio", "amara");
			otrosEspacios.put("Polideportivo", "Anoeta");
			otrosEspacios.put("Biblioteca", "Koldo Mitxelena");
			otrosEspacios.put("Universidad", "EHU");


			System.out.print("\n\n----Impresion Hashtable : \n");
			System.out.println(otrosEspacios.get("Biblioteca"));
			System.out.println(otrosEspacios.get("Universidad"));
	        
	}
}
