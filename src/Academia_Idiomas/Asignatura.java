package Academia_Idiomas;

/*no tiene método main porque es una clase POJO de nuestro programa */

public class Asignatura {

	/* Atributos */
	
	private String nombre;
	private int numero_horas;
	private String codigo_identificacion;

	/*constructor vacío por defecto para inicializar los valores de los atributos declarados arriba */

	public Asignatura() {
		nombre = "";
		numero_horas = 0;
		codigo_identificacion = "";

	}

	/*constructor con parámetros (asignamos el parámetro a los atributos): le he asignado nombres diferentes a los atributos para abreviarlo */
	public Asignatura(String nombre, int numero_horas, String codigo_identificacion) {
		this.nombre = nombre;
		this.numero_horas = numero_horas;
		this.codigo_identificacion = codigo_identificacion;

	}
	
	/* métodos getter para poder llamar a los atributos desde otras clases y métodos setter para poder modificar los valores de los atributos*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero_horas() {
		return numero_horas;
	}

	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}

	public String getCodigo_identificacion() {
		return codigo_identificacion;
	}

	public void setCodigo_identificacion(String codigo_identificacion) {
		this.codigo_identificacion = codigo_identificacion;
	}

}
