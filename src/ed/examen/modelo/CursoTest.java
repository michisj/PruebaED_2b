package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	private Curso curso = new Curso();
	@Test
	void testEliminarAlumno() {
		boolean exceptionLanzada=false;
		try {
			curso.eliminarAlumno("1");
		} catch (Exception e) {
			exceptionLanzada=true;
		}
		assertTrue(exceptionLanzada);
		
		
		try {
			int alumnosAntes = curso.numeroAlumnos();
			curso.eliminarAlumno("123456789");
			int alumnosDespues = curso.numeroAlumnos();
			assertEquals(alumnosAntes, alumnosDespues);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		curso.aniadirAlumno(new Persona ("123456789", "Miguel", "San Juan"));
		try {
			int alumnosAntes = curso.numeroAlumnos();
			curso.eliminarAlumno("123456789");
			int alumnosDespues = curso.numeroAlumnos();
			assertEquals(alumnosAntes-1, alumnosDespues);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testAniadirAlumno() {
		int numAntes = curso.numeroAlumnos();
		curso.aniadirAlumno(new Persona ("1111", "Miguel", "San Juan"));
		int numDespues = curso.numeroAlumnos();
		assertEquals(numAntes+1, numDespues);
	}

	@Test
	void testEstaRegistrado() {
		
		//cuando alguien no este registrado
		boolean valordevuelto = curso.estaRegistrado("123456789");
		assertFalse(valordevuelto);
		
		//cuando esta registrado
		curso.aniadirAlumno(new Persona ("1111", "Miguel", "San Juan"));
		valordevuelto = curso.estaRegistrado("1111");
		assertTrue(valordevuelto);
	}

	@Test
	void testCurso() {
		assertEquals(0, curso.numeroAlumnos());
	}


}
