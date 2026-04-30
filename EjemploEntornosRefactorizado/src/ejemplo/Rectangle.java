package ejemplo;

public class Rectangle {
	private static final int FACTOR_PERIMETRO = 2;

	private int ancho;
	
	private int alto;
	
	public Rectangle(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int surface() {
		Integer resultado = validarDimensiones();
	    if (resultado != null) {
	        return resultado;
	    }
	    return ancho * alto;
	}

	/**
	 * @return
	 */
	private Integer validarDimensiones() {
		if (ancho < 0 || alto < 0) {
			return -1;
		}
		if (ancho == 0 || alto == 0) {
			return 0;
		}
		return null;
	}
	
	public int perimeter() {
		Integer resultado = validarDimensiones();
	    if (resultado != null) {
	        return resultado;
	    }
		return FACTOR_PERIMETRO * ancho + 2 * alto;
	}
}
