public class Museos extends EspacioPublico
{

	private int idMuseo;
	private String tipoMuseo, nombreMuseo;

        /*public Museos() {
		super();
	}*/

	// getter y sets

        public int getIdMuseo()
		{
			return idMuseo;
		}
		
		public void  setIdMuseo(int idMuseo1)
		{
			idMuseo=idMuseo1;
		}

		
		
		public String getTipoMuseo()
		{
			return tipoMuseo;
		}
		
		public void  setTipoMuseo(String tipoMuseo1)
		{
			tipoMuseo1=tipoMuseo1;
		}
		
		
		public String getNombreMuseo()
		{
			return nombreMuseo;
		}
		
		public void  setNombreMuseo(String nombreMuseo1)
		{
			nombreMuseo=nombreMuseo1;
		}
}
