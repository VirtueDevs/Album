
public class Album {
	
	// Atributes
	private String titulo;
	private byte numeroCanciones;
	private String genero;
	
	//constructores
	public Album(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Album(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
	}

	public Album(String titulo, byte numeroCanciones, String genero) {
		super();
		this.titulo = titulo;
		this.numeroCanciones = numeroCanciones;
		this.genero = genero;
	}

	public String obtenerTitulo() {
		return titulo;
	}

	public void actualizarTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte obtenerNumeroCanciones() {
		return numeroCanciones;
	}

	public void actualizarNumeroCanciones(byte numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}

	public String obtenerGenero() {
		return genero;
	}

	public void actualizarGenero(String genero) {
		this.genero = genero;
	}

	
	
}