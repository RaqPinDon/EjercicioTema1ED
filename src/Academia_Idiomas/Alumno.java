package Academia_Idiomas;

/*no tiene método main porque es una clase POJO de nuestro programa */

public class Alumno {

	/* Atributos */

	private String nombre;
	private String direccion_alumno;
	private int numero_matricula;
	//empleamos un double porque las notas pueden ser decimales
	private double nota_asignatura;
	//el atributo centro tiene que ser de tipo Centro y el atributo asignatura debe de ser de tipo Asignatura
	private Centro centro;
	private Asignatura asignatura;

	/*Constructor vacío, donde iniciamos a sus valores nulos cada atributo declarado antes según su tipo de dato*/

	public Alumno() {

		nombre = "";
		direccion_alumno = "";
		/*los atributos de tipo int, los inicio a 0 */
		numero_matricula = 0;
		nota_asignatura = 0.0;
		/*valor nulo del atributo centro perteneciente a la clase Centro */
		centro = new Centro();
		asignatura =new Asignatura ();
	}

	/* constructor con parámetros (asignamos el valor del parámetro al atributo): le he asignado nombres diferentes a los atributos para abreviarlo */

	public Alumno(String nombre, String direccion_alumno, int numero_matricula, double nota_asignatura, Centro centro,
			Asignatura asignatura) {

		/* le añadimos el this para decir que el nombre del atributo va a coincidir con el nombre del parámetro */
		/*La palabra clave THIS es una variable que hace referencia al objeto actual */

		this.nombre = nombre;
		this.direccion_alumno = direccion_alumno;
		this.numero_matricula = numero_matricula;
		this.nota_asignatura = nota_asignatura;
		this.centro = centro;
		this.asignatura = asignatura;
	}

	/* métodos getter para poder llamar a los atributos desde otras clases y métodos setter para poder modificar los valores de los atributos*/
	/* los métodos permiten agrupar un conjunto de instrucciones para realizar una tarea y a la que podremos llamar tantas veces como necesitemos usando un nombre,
	 * sin la necesidad de tener que repetir el código */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion_alumno() {
		return direccion_alumno;
	}

	public void setDireccion_alumno(String direccion_alumno) {
		this.direccion_alumno = direccion_alumno;
	}

	public int getNumero_matricula() {
		return numero_matricula;
	}

	public void setNumero_matricula(int numero_matricula) {
		this.numero_matricula = numero_matricula;
	}

	public double getNota_asignatura() {
		return nota_asignatura;
	}

	public void setNota_asignatura(double nota_asignatura) {
		this.nota_asignatura = nota_asignatura;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Asignatura getAsignatura_matriculada() {
		return asignatura;
	}

	public void setAsignatura (Asignatura asignatura) {
		this.asignatura = asignatura;
	}

}
