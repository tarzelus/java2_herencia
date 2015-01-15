museopublic class Iglesias extends EspacioPublico
{
	private String nombreIglesia;
	private int idIglesia;
	private String tipoIglesia;

        public Iglesias() {
		super();
        }

	// getter y setter

		public String getNombreiglesia()
		{
			return nombreIglesia;
		}
		
		public void  setNombreIglesia(String nombreIglesia1)
		{
			nombreIglesia=nombreIglesia1;
		}
		
		
		
		public int getIdIglesia()
		{
			return idIglesia;
		}
		
		public void  setIdIglesia(int idIglesia1)
		{
			idIglesia=idIglesia1;
		}

		
		
		public String getTipoIglesia()
		{
			return tipoIglesia;
		}
		
		public void  setTipoIglesia(String tipoIglesia1)
		{
			tipoIglesia=tipoIglesia1;
		}
	
}