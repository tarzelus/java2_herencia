import java.util.Hashtable;


public class Main {
	public static void main (String[] Args) {
	        Museos museo = new Museos();
	        museo.setTipoMuseo("Museo");
	        museo.setNombreMuseo("San Telmo museoa");
	        museo.setIdMuseo(1);

	        
	        System.out.print("--- Museo: ");
	        System.out.print("\nTipo: " + museo.getTipoMuseo());
	        System.out.print("\nNombre: " + museo.getNombreMuseo());
	        System.out.print("\nId: " + museo.getIdMuseo());


	        Iglesias iglesia = new Iglesias();
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
