package Academia_Idiomas;

/*no tiene método main porque es una clase POJO de nuestro programa */


public class Centro {
	
	/* Atributos */

	private String nombre_centro;
	private String direccion;
	private String codigo;
	
	/*constructor vacío */

	public Centro() {
		nombre_centro = "";
		direccion = "";
		codigo = "";
	}
	
	/* constructor con parámetros */

	public Centro(String nombre_centro, String direccion, String codigo) {
		this.nombre_centro = nombre_centro;
		this.direccion = direccion;
		this.codigo = codigo;

	}
	
	/*métodos getter para poder llamar a los atributos desde otras clases y método setter para poder modificar los valores de los atributos*/

	public String getNombre_centro() {
		return nombre_centro;
	}

	public void setNombre_centro(String nombre_centro) {
		this.nombre_centro = nombre_centro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
