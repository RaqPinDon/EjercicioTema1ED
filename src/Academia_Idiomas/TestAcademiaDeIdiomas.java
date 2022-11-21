package Academia_Idiomas;

public class TestAcademiaDeIdiomas {
	
	//Esta clase si tiene método main. Es donde se van a crear instancias de alumnos, centros y asignaturas con sus respectivos datos. 
	//Para instanciar objetos se usarán constructores de las clases correspondientes
	
	public static void main(String[] args) {
		//para crear nuevos alumnos, asignaturas, centros he empleado el constructor por parámetro y le he añadido los valores de sus respectivos parámetros.
		//Hay que escribirlo siguiendo un orden determinado, pues
		//no puedo crear un objeto con un parámetro (cuyo objeto) que no existe. Por eso he instanciado alumnos en último lugar.
		
		Centro cent1=new Centro("Escuela de Ingles","Reyes Catolicos, 14","codigoA" );
		Centro cent2=new Centro("Escuela de frances","Cristobal Colon, 92", "codigoB");
		
		Asignatura asig1=new Asignatura("Ingles B1", 3, "111A");
		Asignatura asig2=new Asignatura("Ingles B2", 5, "222B");
		Asignatura asig3=new Asignatura("Frances A2", 2, "333C");
		Asignatura asig4=new Asignatura("Frances B1", 3, "444C");
		
		//Entre los parámetros del objeto Alumno, se invoca al objeto Centro y Asignatura.

		Alumno al1= new Alumno("Ana Abel","Paseo de América, 15", 1 ,7.0, cent1,asig1);
		Alumno al2= new Alumno("Benito Bueno","Reyes Católicos 16",2,6.0, cent1, asig2);
		Alumno al3= new Alumno("Carmen Cano","Reyes Católicos,2",3,5.0, cent1, asig1);
		Alumno al4= new Alumno("Esteban Escalera","Isabel la Católica, 28",  4, 9.0, cent2, asig4);
		Alumno al5= new Alumno("Francisco Farfán", "Cristóbal Colón, s/n", 5, 8.5, cent2, asig3);
		Alumno al6 =new Alumno("Raquel Pino","Sevilla ", 6 , 10.0, cent1, asig2);
		
		//Segun la información que quiera obtener voy llamando a los diferentes métodos get.También podríamos cambiar los valores con set.
		
		/*System.out.println("----------------------------Ejercicio 1-----------------------------");

		System.out.println("El centro de  " + cent1.getNombre_centro() + " se encuentra en la siguiente direccion: " +  cent1.getDireccion()) ;
		System.out.println("El centro de  " + cent2.getNombre_centro() + " se encuentra en la siguiente direccion: " +  cent2.getDireccion()) ;*/
		
		/*System.out.println("----------------------------Ejercicio 2-----------------------------");
		
		System.out.println("La alumna: " + al3.getNombre() + ", esta matriculada en el centro: " + cent1.getNombre_centro() + " que se encuentra en la direccion: " + cent1.getDireccion());*/
		
		System.out.println("----------------------------Ejercicio 3 -----------------------------");
		
		System.out.println("La nota que ha sacado " + al2.getNombre() + " en " + asig2.getNombre() + " es un " + al2.getNota_asignatura()); 
		
		
	}

}
