package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	private Curso curso = new Curso();
	@Test
	void testEliminarAlumno() {
		fail("Not yet implemented");
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

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
