package ed.examen.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	

	/**
	 * Constructor de persona con tres parámetros
	 * @param dni dni de la persona que desea crear
	 * @param nombre nombre de la persona que desea crear
	 * @param apellido1 apellido de la persona que desea crear
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que devuelve el dni de la persona
	 * @return dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Modifica el dni de la persona
	 * @param dni dni de la persona que desea crear
	 * @throws Exception Es la excepción del dni
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	

	/**
	 * Método que devuelve el nombre de la persona
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * Modifica el nombre
	 * @param nombre nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método que devuelve el apellido de la persona
	 * @return apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Modifica el apellido de la persona
	 * @param apellido1 apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
